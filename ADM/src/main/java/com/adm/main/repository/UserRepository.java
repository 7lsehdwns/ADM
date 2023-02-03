package com.adm.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adm.main.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
