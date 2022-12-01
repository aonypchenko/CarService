package com.example.carservice.service;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository repository;


    public CarServiceImpl(CarRepository repository, CarRepository carRepository) {
        this.repository = repository;
    }

    public Car findCarByModel() {
        Car carToUpdate = repository.findCarByModel("IS-250");
        return carToUpdate;
    }

    @Override
    public List<Car> getAll() {
        return repository.findAll();
    }

    @Override
    public Car update() {
        Car carToUpdate = findCarByModel();
        carToUpdate.setColor("black");
        repository.save(carToUpdate);
        return carToUpdate;
    }
}
