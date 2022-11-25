package com.example.carservice.controller;

import com.example.carservice.model.Car;
import com.example.carservice.model.EngineType;
import com.example.carservice.repository.CarRepository;
import com.example.carservice.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
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

    @PostMapping("add")
    public String addCars(){
        Car Lexus = new Car();
        Lexus.setModel("IS-250");
        Lexus.setColor("white");
        Lexus.setPrice(15000);
        Lexus.setEngine(EngineType.GASOLINE);
        Lexus.setPower(200);
        Lexus.setEngineVolume(2.5);
        Lexus.setIssueDate(LocalDate.ofEpochDay(2022-11-24));
        carRepository.save(Lexus);
        return Lexus.getModel();
    }

}
