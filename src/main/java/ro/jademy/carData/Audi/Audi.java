package ro.jademy.carData.Audi;

import ro.jademy.carData.Car;
import ro.jademy.carData.Make;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class Audi extends Car {

    private static final Make AUDI =new Make("Audi") ;

    public Audi(Model model, LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(AUDI, model, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
