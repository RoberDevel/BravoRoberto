package com.roberdev.clase7ejercicio1.service;

import com.roberdev.clase7ejercicio1.entity.Car;
import com.roberdev.clase7ejercicio1.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CarService implements ICarService {

    @Autowired
    CarRepository carRepository;


    @Override
    public void insertCar(Car car) {

        carRepository.insertCar(car);
    }

    @Override
    public List<Car> requestCars() {
        return carRepository.requestCars();
    }

    @Override
    public List<Car> requestCarsSortedByPrice() {
        return carRepository.requestCars().stream().sorted(Comparator.comparing(Car::getPrice)).toList();
    }

    @Override
    public Car requestCarById(Long id) {
        return carRepository.requestCars().stream().filter(car -> car.getId().equals(id)).findFirst().orElse(null);
    }
}
