package com.airport.entities;

public class passenger {
    private int id_passenger;
    private String name;
    private  String lastname;
    private int identify_document;

    public passenger() {
    }

    public passenger(int id_passenger, String name, String lastname, int identify_document) {
        this.id_passenger = id_passenger;
        this.name = name;
        this.lastname = lastname;
        this.identify_document = identify_document;
    }

    public int getId_passenger() {
        return id_passenger;
    }

    public void setId_passenger(int id_passenger) {
        this.id_passenger = id_passenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIdentify_document() {
        return identify_document;
    }

    public void setIdentify_document(int identify_document) {
        this.identify_document = identify_document;
    }

    @Override
    public String toString() {
        return
                "id_passenger: " + id_passenger +
                ", name: " + name +
                ", lastname: " + lastname +
                ", identify_document: " + identify_document ;

    }
}
