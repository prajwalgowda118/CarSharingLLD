package com.scaler.carsharing.carsharinglld.Service;


import com.scaler.carsharing.carsharinglld.Exception.driverAlreadyExist;
import com.scaler.carsharing.carsharinglld.Models.Driver;
import com.scaler.carsharing.carsharinglld.Models.Passenger;
import com.scaler.carsharing.carsharinglld.Models.UserType;
import com.scaler.carsharing.carsharinglld.Repository.DriverRepository;
import com.scaler.carsharing.carsharinglld.Repository.PassengerRepository;
import com.scaler.carsharing.carsharinglld.Repository.RideRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RideService {

    private final RideRepository rideRepository;
    private final DriverRepository driverRepository;
    private final PassengerRepository passengerRepository;

    public RideService(RideRepository rideRepository, DriverRepository driverRepository, PassengerRepository passengerRepository) {
        this.rideRepository = rideRepository;
        this.driverRepository = driverRepository;
        this.passengerRepository = passengerRepository;

    }

    public Driver registerUser (Driver driver) {

        Optional<Driver> driverOptional = driverRepository.findByEmail(driver.getEmail());
        if (driverOptional.isPresent()) {
            throw new driverAlreadyExist("driver already exist");
        }
        Driver newDriver = new Driver();
       /// newDriver.setId(driver.getId());
        newDriver.setName(driver.getName());
        newDriver.setAge(driver.getAge());
        newDriver.setEmail(driver.getEmail());
        newDriver.setPassword(driver.getPassword());
        newDriver.setUserType(UserType.DRIVER);
        driverRepository.save(newDriver);
        return newDriver;
    }

    public Passenger registerPassenger(Passenger passenger) {

        Optional<Passenger> optionalPassenger=passengerRepository.findByEmail(passenger.getEmail());
        if (optionalPassenger.isPresent()) {
            throw new driverAlreadyExist("Passenger already exist");
        }

        Passenger newPassenger = new Passenger();
        newPassenger.setName(passenger.getName());
        newPassenger.setAge(passenger.getAge());
        newPassenger.setEmail(passenger.getEmail());
        newPassenger.setPassword(passenger.getPassword());
        newPassenger.setUserType(UserType.PASSENGER);
        passengerRepository.save(newPassenger);
        return newPassenger;

    }
}
