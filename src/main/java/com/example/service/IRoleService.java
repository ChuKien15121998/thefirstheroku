package com.example.service;

import com.example.model.Role;
import com.example.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name); //

}
