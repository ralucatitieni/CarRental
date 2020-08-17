package ro.jademy.carData.Dacia;

import ro.jademy.carData.Model;

import java.time.LocalDate;

public class DaciaSandero extends Dacia {

    private static final Model SANDERO =new Model("Sandero") ;
    public DaciaSandero(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(SANDERO, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
