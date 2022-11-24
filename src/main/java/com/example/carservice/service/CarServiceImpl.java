package com.example.carservice.service;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository repository;

    public CarServiceImpl(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Car> getCars() {
        return repository.findAll();
    }
}
