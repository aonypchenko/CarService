package com.example.carservice.service;

import com.example.carservice.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCars();

    void removeById(Long id);
}
