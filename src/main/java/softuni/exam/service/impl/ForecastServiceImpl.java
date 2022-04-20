package softuni.exam.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.ImportForecastDTO;
import softuni.exam.models.dto.ImportForecastRootDTO;
import softuni.exam.models.entity.City;
import softuni.exam.models.entity.DayOfWeek;
import softuni.exam.models.entity.Forecast;
import softuni.exam.repository.CityRepository;
import softuni.exam.repository.ForecastRepository;
import softuni.exam.service.ForecastService;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static softuni.exam.models.entity.DayOfWeek.SUNDAY;

@Service
public class ForecastServiceImpl implements ForecastService {
    private final Path path = Path.of("src", "main", "resources", "files", "xml", "forecasts.xml");

    private final ForecastRepository forecastRepository;
    private final CityRepository cityRepository;

    private final Unmarshaller unmarshaller;
    private final Validator validator;
    private final ModelMapper modelMapper;


    @Autowired
    public ForecastServiceImpl(ForecastRepository forecastRepository, CityRepository cityRepository) throws JAXBException {
        this.forecastRepository = forecastRepository;
        this.cityRepository = cityRepository;

        JAXBContext context = JAXBContext.newInstance(ImportForecastRootDTO.class);
        this.unmarshaller = context.createUnmarshaller();

        this.validator = Validation.buildDefaultValidatorFactory().getValidator();

        this.modelMapper = new ModelMapper();

        this.modelMapper.addConverter(
                ctr -> LocalTime.parse(ctr.getSource(), DateTimeFormatter.ofPattern("HH:mm:ss")),
                String.class, LocalTime.class
        );

    }

    @Override
    public boolean areImported() {
        return this.forecastRepository.count() > 0;
    }

    @Override
    public String readForecastsFromFile() throws IOException {
        return Files.readString(path);
    }

    @Override
    public String importForecasts() throws IOException, JAXBException {
        ImportForecastRootDTO forecastDTOs = (ImportForecastRootDTO) this.unmarshaller
                .unmarshal(new FileReader(path.toAbsolutePath().toString()));



        return forecastDTOs
                .getForecasts()
                .stream()
                .map(this::importForecast)
                .collect(Collectors.joining("\n"));
    }

    private String importForecast(ImportForecastDTO dto) {
        Set<ConstraintViolation<ImportForecastDTO>> validate = validator.validate(dto);

        if (!validate.isEmpty()){
            return "Invalid forecast";
        }

        Optional<Forecast> optionalForecast = this.forecastRepository
                .findByDayOfWeekAndCityId(dto.getDayOfWeek(), dto.getCity());

        if (optionalForecast.isPresent()){
            return "Invalid forecast";
        }

        Forecast forecast = this.modelMapper.map(dto, Forecast.class);

        Optional<City> city = this.cityRepository.findById(dto.getCity());

        forecast.setCity(city.get());

        this.forecastRepository.save(forecast);

        return String.format("Successfully import forecast %s - %.2f",
                forecast.getDayOfWeek(),
                forecast.getMaxTemperature());
    }

    @Override
    public String exportForecasts() {
        DayOfWeek dayOfTheWeek = SUNDAY;
        int population = 150000;

        List<Forecast> forecast = this.forecastRepository
                .findAllByDayOfWeekAndCityPopulationLessThanOrderByMaxTemperatureDescIdAsc(dayOfTheWeek, population);

        return forecast
                .stream()
                .map(Forecast::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }
}
