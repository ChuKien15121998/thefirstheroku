package com.example.repository;


import com.example.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username); // Tim kiem User co ton tai trong DB khong?
    Boolean existsByUsername(String username); // username da co trong DB chua, khi tao du lieu
    Boolean existsByEmail(String email); // email da co  trong DB chua, khi tao du lieu
}
