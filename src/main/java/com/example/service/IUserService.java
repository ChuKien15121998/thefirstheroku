package com.example.service;

import com.example.model.Users;

import java.util.Optional;

public interface IUserService {
    Optional<Users> findByUsername(String username); // Tim kiem User co ton tai trong DB khong?
    Boolean existsByUsername(String username); // username da co trong DB chua, khi tao du lieu
    Boolean existsByEmail(String email); // email da co  trong DB chua, khi tao du lieu
    Users save (Users users);
}
