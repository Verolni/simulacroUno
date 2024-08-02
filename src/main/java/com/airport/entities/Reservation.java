package com.airport.entities;

public class Reservation {
    private int reservationId;
    private int passengerId;
    private int flightId;
    private String reservationDate;
    private String seat;

    public Reservation() {
    }

    public Reservation(int reservationId, int passengerId, int flightId, String reservationDate, String seat) {
        this.reservationId = reservationId;
        this.passengerId = passengerId;
        this.flightId = flightId;
        this.reservationDate = reservationDate;
        this.seat = seat;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return
                "reservationId: " + reservationId +
                        ", passengerId: " + passengerId +
                        ", flightId: " + flightId +
                        ", reservationDate: " + reservationDate +
                        ", seat='" + seat;
    }
}