package ro.jademy.carData.Audi;

import ro.jademy.carData.Car;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class AudiQ3 extends Audi {
    private static final Model Q3 =new Model("Q3") ;
    public AudiQ3(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(Q3, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
