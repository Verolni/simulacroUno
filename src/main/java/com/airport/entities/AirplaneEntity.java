package com.airport.entities;

public class AirplaneEntity {
    private int airplaneId;
    private String model;
    private int capacity;

    public AirplaneEntity() {
    }

    public AirplaneEntity(int airplaneId, String model, int capacity) {
        this.airplaneId = airplaneId;
        this.model = model;
        this.capacity = capacity;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return
                "airplaneId: " + airplaneId +
                        ", model: " + model + '\'' +
                        ", capacity: " + capacity;
    }
}