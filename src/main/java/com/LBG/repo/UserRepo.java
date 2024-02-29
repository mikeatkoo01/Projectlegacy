package com.LBG.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LBG.domain.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
