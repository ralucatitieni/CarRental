package ro.jademy.carData.Dacia;

import ro.jademy.carData.Model;

import java.time.LocalDate;

public class DaciaLogan extends Dacia {


    private static final Model LOGAN =new Model("Logan") ;

    public DaciaLogan(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(LOGAN, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
