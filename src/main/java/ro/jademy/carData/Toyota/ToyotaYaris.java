package ro.jademy.carData.Toyota;

import ro.jademy.carData.Car;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class ToyotaYaris extends Toyota {

    private static final Model YARIS =new Model("Yaris") ;
    public ToyotaYaris(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(YARIS, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
