package com.colutti.sampleKafkaProducer.controller;

import com.colutti.sampleKafkaProducer.dto.CarDTO;
import com.colutti.sampleKafkaProducer.producer.CarProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarProducer carProducer;

    @PostMapping
    public ResponseEntity<CarDTO> create(@RequestBody CarDTO carDTO){
        CarDTO car = new CarDTO(UUID.randomUUID().toString(),carDTO.getModel(),carDTO.getColor());
        carProducer.send(car);
        return new ResponseEntity(car, HttpStatus.CREATED);
    }

}
