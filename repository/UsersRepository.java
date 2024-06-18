package com.caz.jobportal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caz.jobportal.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

    Optional<Users> findByEmail(String email);


}
