package ro.jademy.carData.Hyundai;

import ro.jademy.carData.Car;
import ro.jademy.carData.Make;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class Hyundai extends Car {

    private static final Make HYUNDAI=new Make("Hyundai");
    public Hyundai(Model model, LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(HYUNDAI, model, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
