package com.hakaton.ovcarbanja.repository;

import com.hakaton.ovcarbanja.model.Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository  extends JpaRepository<Item,Integer> {

}
