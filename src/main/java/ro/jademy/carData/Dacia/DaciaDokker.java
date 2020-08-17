package ro.jademy.carData.Dacia;

import ro.jademy.carData.Model;

import java.time.LocalDate;

public class DaciaDokker extends Dacia {

    private static final Model DOKKER =new Model("Dokker") ;

    public DaciaDokker(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(DOKKER, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
