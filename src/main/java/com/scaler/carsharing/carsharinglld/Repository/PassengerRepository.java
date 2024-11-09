package com.scaler.carsharing.carsharinglld.Repository;

import com.scaler.carsharing.carsharinglld.Models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    Optional<Passenger> findByEmail(String email);
}
