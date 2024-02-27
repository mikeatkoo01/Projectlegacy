package com.LBG.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LBG.domain.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
