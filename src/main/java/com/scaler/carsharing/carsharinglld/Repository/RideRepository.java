package com.scaler.carsharing.carsharinglld.Repository;

import com.scaler.carsharing.carsharinglld.Models.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
