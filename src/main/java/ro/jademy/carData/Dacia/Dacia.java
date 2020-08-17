package ro.jademy.carData.Dacia;

import ro.jademy.carData.Car;
import ro.jademy.carData.Make;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class Dacia extends Car {
    private static final Make DACIA=new Make("Dacia");

    public Dacia(Model model, LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(DACIA, model, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
