package com.example.carservice.service;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository repository;
    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository repository, CarRepository carRepository) {
        this.repository = repository;
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCars() {
        return repository.findAll();
    }

    @Override
    public Car updateCar(){
        Car carToUpdate= carRepository.findCarByModel("IS-250");
        carToUpdate.setColor("new color");
        carRepository.save(carToUpdate);
        return null;
    }
}
