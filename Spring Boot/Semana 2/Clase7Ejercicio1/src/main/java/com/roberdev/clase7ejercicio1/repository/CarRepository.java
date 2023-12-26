package com.roberdev.clase7ejercicio1.repository;

import com.roberdev.clase7ejercicio1.entity.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    private Long id = 8L;
    private List<Car> cars;

    public CarRepository() {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "Volkswagen", "Golf Gti", "90000", 5, 17500.0));
        cars.add(new Car(2L, "Peugeot", "208", "20210", 5, 10000.0));
        cars.add(new Car(3L, "Ford", "Fiesta", "30034", 5, 12000.0));
        cars.add(new Car(4L, "Chevrolet", "Corsa", "47025", 3, 15000.0));
        cars.add(new Car(5L, "Ford", "Focus", "50327", 5, 17000.0));
        cars.add(new Car(6L, "Land Rover", "Discovery", "60098", 5, 70000.0));
        cars.add(new Car(7L, "Lamborghini", "Huracan", "78014", 2, 150000.0));
    }


    public void insertCar(Car car) {
        car.setId(id++);
        cars.add(car);
    }


    public List<Car> requestCars() {
        return cars;
    }


}
