package com.roberdev.clase7ejercicio1.controller;

import com.roberdev.clase7ejercicio1.entity.Car;
import com.roberdev.clase7ejercicio1.service.ICarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    @Autowired
    ICarService carService;

    @PostMapping("/vehicles")
    public void insertCar(@RequestBody Car car) {

        carService.insertCar(car);

    }

    @GetMapping("/vehicles")
    public List<Car> requestCars() {
        return carService.requestCars();
    }

    @GetMapping("/vehicles/priced")
    public List<Car> requestCarsSortedByPrice() {
        return carService.requestCarsSortedByPrice();
    }

    @GetMapping("/vehicles/{id}")
    public Car requestCarById(@PathVariable Long id) {
        return carService.requestCarById(id);
    }

}
