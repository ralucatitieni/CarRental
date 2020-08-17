package ro.jademy.carData.Dacia;

import ro.jademy.carData.Car;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class DaciaDuster extends Dacia {

    private static final Model DUSTER =new Model("Duster") ;
    public DaciaDuster(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(DUSTER, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
