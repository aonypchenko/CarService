package com.example.carservice.repository;

import com.example.carservice.model.Car;

import java.util.List;

public interface CarRepository {

    List<Car> cars = List.of(
            new Car("Hyundai Sonata", 12000),
            new Car("BMW 540i", 54000)
    );
}
