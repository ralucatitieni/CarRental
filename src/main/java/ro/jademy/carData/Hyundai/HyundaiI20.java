package ro.jademy.carData.Hyundai;

import ro.jademy.carData.Car;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class HyundaiI20 extends Hyundai {
    private static final Model I20 =new Model("i20") ;
    public HyundaiI20(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(I20, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
