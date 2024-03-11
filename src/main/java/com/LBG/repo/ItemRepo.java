package com.LBG.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LBG.domain.Item;

public interface ItemRepo extends JpaRepository<Item, Integer> {

}
