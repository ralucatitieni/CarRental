package ro.jademy.carData.Audi;

import ro.jademy.carData.Car;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class AudiA7 extends Audi {
    private static final Model A7 =new Model("A7") ;
    public AudiA7( LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(A7, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
