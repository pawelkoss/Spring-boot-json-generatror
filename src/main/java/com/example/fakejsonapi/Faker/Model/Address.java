package com.example.fakejsonapi.Faker.Model;

public class Address {
    private int id;
    private String streetName;
    private String number;
    private String city;
    private String postal;
    private String fullAddress;

    public Address(int id, String streetName, String number, String city, String postal, String fullAddress) {
        this.id = id;
        this.streetName = streetName;
        this.number = number;
        this.city = city;
        this.postal = postal;
        this.fullAddress = fullAddress;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}
