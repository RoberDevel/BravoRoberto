package com.roberdev.clase7ejercicio1.service;

import com.roberdev.clase7ejercicio1.entity.Car;

import java.util.List;

public interface ICarService {

    void insertCar(Car car);


    List<Car> requestCars();

    List<Car> requestCarsSortedByPrice();

    Car requestCarById(Long id);
}
