package com.swan.authorization.repository;


import com.swan.authorization.model.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SystemUser, String> {

    @Query("SELECT u FROM SystemUser u WHERE LOWER(u.username) = LOWER(:username)")
    Optional<SystemUser> findByUsername(@Param("username") String username);

}