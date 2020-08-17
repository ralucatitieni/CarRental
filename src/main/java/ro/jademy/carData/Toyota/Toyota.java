package ro.jademy.carData.Toyota;

import ro.jademy.carData.Car;
import ro.jademy.carData.Make;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class Toyota extends Car {
    private static final Make TOYOTA=new Make("Toyota");

    public Toyota(Model model, LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(TOYOTA, model, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
