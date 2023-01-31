package mobiLeLe.services.role;

import mobiLeLe.domain.dtos.view.RoleViewDto;

import java.util.List;

public interface RoleService {
    List<RoleViewDto> getAll();
}
