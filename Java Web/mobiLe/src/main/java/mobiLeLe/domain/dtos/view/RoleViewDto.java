package mobiLeLe.domain.dtos.view;

import mobiLeLe.domain.enums.Role;

public class RoleViewDto {
    private Role role;

    public Role getRole() {
        return role;
    }

    public RoleViewDto setRole(Role role) {
        this.role = role;
        return this;
    }
}
