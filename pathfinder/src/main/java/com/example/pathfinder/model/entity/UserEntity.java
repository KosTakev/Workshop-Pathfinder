package com.example.pathfinder.model;

import com.example.pathfinder.model.entity.BaseEntity;
import com.example.pathfinder.model.entity.RoleEntity;
import com.example.pathfinder.model.entity.enums.LevelEnum;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    private String username;
    private String password;
    private String email;
    @ManyToMany
    private Set<RoleEntity> roles;
    private LevelEnum level;
}
