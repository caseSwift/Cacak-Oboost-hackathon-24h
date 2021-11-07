package com.hakaton.ovcarbanja.repository;

import com.hakaton.ovcarbanja.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    }
