package ro.jademy.carData.Audi;

import ro.jademy.carData.Car;
import ro.jademy.carData.Make;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class AudiA3Sportback extends Audi {
    private static final Model A3SPORTBACK =new Model("A3 Sportback") ;

    public AudiA3Sportback(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super( A3SPORTBACK,year, fuelType, price, noOfDoors, noOfSeats);
    }
}
