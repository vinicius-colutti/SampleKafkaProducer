package com.colutti.sampleKafkaProducer.dto;

public class CarDTO {

    private String id;
    private String model;
    private String color;

    public CarDTO(){

    }

    public CarDTO(String id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
