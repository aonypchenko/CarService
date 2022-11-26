package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.repository.CarRepository;
import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {

    private final CarService service;
    private final CarRepository carRepository;

    public CarController(CarService service, CarRepository carRepository) {
        this.service = service;
        this.carRepository = carRepository;
    }

    @GetMapping
    public List<Car> getCars() {
        return service.getCars();
    }

    @PutMapping("update")
    public Car updateCars(){
        return service.updateCar();
    }
}
