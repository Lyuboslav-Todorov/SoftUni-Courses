package mobiLeLe.models.entities;

import mobiLeLe.models.enums.Role;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class UserRole extends BaseEntity{
    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private Role role;

    public Role getRole() {
        return role;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }
}
