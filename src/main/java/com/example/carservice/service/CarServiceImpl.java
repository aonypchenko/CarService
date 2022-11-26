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
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public Car addCar(){
        Car newCar=new Car();
        newCar.setModel("BMW M4");
        newCar.setColor("black");
        newCar.setPrice(15000);
        newCar.setEngine(EngineType.GASOLINE);
        newCar.setPower(306);
        newCar.setEngineVolume(3.0);
        newCar.setIssueDate(LocalDate.ofEpochDay(2022-11-24));
        carRepository.save(newCar);
        return null;
    }
}
