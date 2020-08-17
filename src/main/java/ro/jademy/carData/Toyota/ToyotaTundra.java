package ro.jademy.carData.Toyota;

import ro.jademy.carData.Car;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class ToyotaTundra extends Toyota {

    private static final Model TUNDRA =new Model("Tundra") ;
    public ToyotaTundra( LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(TUNDRA,year, fuelType, price, noOfDoors, noOfSeats);
    }
}
