package interfacesAndAbstractionExercises.telephony_05;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String call() {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        StringBuilder builder = new StringBuilder();
        for (String number : this.numbers) {
            if (this.isValid(number, pattern)){
                builder.append(String.format("Calling... %s", number));
                builder.append(System.lineSeparator());
            } else {
                builder.append("Invalid number!");
                builder.append(System.lineSeparator());
            }
        }
        return builder.toString().trim();
    }

    @Override
    public String browse() {
        Pattern pattern = Pattern.compile("^[^0-9]+$");
        StringBuilder builder = new StringBuilder();
        for (String url : this.urls) {
            if (this.isValid(url, pattern)){
                builder.append(String.format("Browsing: %s!", url));
                builder.append(System.lineSeparator());
            } else {
                builder.append("Invalid URL!");
                builder.append(System.lineSeparator());
            }
        }
        return builder.toString().trim();
    }

    private boolean isValid(String number, Pattern pattern){
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }


}
