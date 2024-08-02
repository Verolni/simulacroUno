package com.airport.entities;

public class FlightEntity {
    private int flightId;
    private String destination;
    private String departureDate;
    private String departureTime;

    private int airplaneId;

    public FlightEntity() {
    }

    public FlightEntity(int flightId, String destination, String departureDate, String departureTime, int airplaneId) {
        this.flightId = flightId;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.airplaneId = airplaneId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    @Override
    public String toString() {
        return
                "flightId: " + flightId +
                        ", destination: " + destination +
                        ", departureDate: " + departureDate +
                        ", departureTime: " + departureTime +
                        ", airplaneId: " + airplaneId;
    }
}