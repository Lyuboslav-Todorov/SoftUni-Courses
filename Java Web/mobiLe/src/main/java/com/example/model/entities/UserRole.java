package com.example.model.entities;

import com.example.model.enums.Role;
import jakarta.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
