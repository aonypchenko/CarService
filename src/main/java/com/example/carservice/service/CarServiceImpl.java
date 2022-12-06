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

    private Car findCarByModel() {
        return repository.findCarByModel("IS-250");
    }

    @Override
    public List<Car> getAll() {
        return repository.findAll();
    }

    @Override
    public Car update() {
        Car carToUpdate = findCarByModel();
        carToUpdate.setColor("black");
        return repository.save(carToUpdate);
    }
}
