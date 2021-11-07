package com.hakaton.ovcarbanja.repository;

import com.hakaton.ovcarbanja.model.Activity;
import com.hakaton.ovcarbanja.model.Stay;
import com.hakaton.ovcarbanja.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StayRepository extends JpaRepository<Stay, Integer> {

    Stay getStayByUser(User user);

}
