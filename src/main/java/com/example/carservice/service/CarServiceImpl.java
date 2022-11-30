package com.example.carservice.service;

import com.example.carservice.model.Car;
import com.example.carservice.model.EngineType;
import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository repository) {
        this.carRepository = repository;
    }

    @Override
    public Car getCars(Long id) {
        Car car=carRepository.findCarById(id);
        return car;
    }

}
