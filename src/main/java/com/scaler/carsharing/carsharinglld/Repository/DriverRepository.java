package com.scaler.carsharing.carsharinglld.Repository;

import com.scaler.carsharing.carsharinglld.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByEmail(String email);
}
