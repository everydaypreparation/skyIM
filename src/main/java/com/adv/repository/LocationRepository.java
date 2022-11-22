package com.adv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adv.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
