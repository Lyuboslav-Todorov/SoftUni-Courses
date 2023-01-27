package mobiLeLe.services.role;

import mobiLeLe.models.dtos.RoleViewDto;
import mobiLeLe.models.entities.UserRole;
import mobiLeLe.models.enums.Role;
import mobiLeLe.repositories.RoleRepository;
import mobiLeLe.services.init.DataBaseInitService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService, DataBaseInitService {

    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository, ModelMapper modelMapper) {
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
        this.dbInit();
    }

    @Override
    public void dbInit() {
        if (!isDbInit()) {
            List<UserRole> roles = new ArrayList<>();
            roles.add(new UserRole().setRole(Role.USER));
            roles.add(new UserRole().setRole(Role.ADMIN));

            this.roleRepository.saveAllAndFlush(roles);
        }
    }

    @Override
    public boolean isDbInit() {
        return this.roleRepository.count() > 0;
    }

    public List<RoleViewDto> getAll() {
        return this.roleRepository.findAll()
                .stream()
                .map(r -> this.modelMapper.map(r, RoleViewDto.class))
                .collect(Collectors.toList());
    }
}
