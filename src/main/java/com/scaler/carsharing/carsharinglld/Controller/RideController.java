package com.scaler.carsharing.carsharinglld.Controller;

import com.scaler.carsharing.carsharinglld.Models.Driver;
import com.scaler.carsharing.carsharinglld.Models.Passenger;
import com.scaler.carsharing.carsharinglld.Service.RideService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ride")
public class RideController {

    private final RideService rideService;
    public RideController(RideService rideService) {
        this.rideService = rideService;

    }

    @PostMapping("/RegisterUser")
    public Driver registerUser(@RequestBody Driver driver) {

        return rideService.registerUser(driver);

    }
    @PostMapping("/RegisterPassenger")
    public Passenger registerPassenger(@RequestBody Passenger passenger) {

        return rideService.registerPassenger(passenger);
    }


}
