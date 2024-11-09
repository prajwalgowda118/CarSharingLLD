package com.scaler.carsharing.carsharinglld.Repository;

import com.scaler.carsharing.carsharinglld.Models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
