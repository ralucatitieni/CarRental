package ro.jademy.carData;

import java.time.LocalDate;
import java.util.UUID;

public class Car {

    // TODO: 8/6/2020  : add car properties, constructors, sub-classes
    protected String id;
    protected Make make;
    protected Model model;
    protected LocalDate year;
    protected String fuelType;
    protected long price;
    protected int noOfDoors;
    protected int noOfSeats;
    protected boolean isRented = false;

    public Car(Make make, Model model, LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        this.id = UUID.randomUUID().toString();     //Genereaza un id random
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.price = price;
        this.noOfDoors = noOfDoors;
        this.noOfSeats = noOfSeats;


    }


    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isRented() {
        return isRented;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                        ", make='" + make + '\'' +
                        ", model='" + model + '\'' +
                        ", year='" + year.getYear() + '\'' +
                        ", fuel type='" + fuelType + '\'' +
                        ", number of doors='" + noOfDoors + '\'' +
                        ", number of seats='" + noOfSeats + '\'' + '}';


    }

   /* @Override
    public String toString() {
        return id + " "
        make + " " +
                model + " " +
                year.getYear() + " " +
                fuelType + " " +
                noOfDoors + " " +
                noOfSeats + " " +
                price / 100 + " RON ";
    }*/
}




