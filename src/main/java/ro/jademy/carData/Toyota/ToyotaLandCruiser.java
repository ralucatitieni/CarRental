package ro.jademy.carData.Toyota;

import ro.jademy.carData.Model;

import java.time.LocalDate;

public class ToyotaLandCruiser extends Toyota {

    private static final Model LAND_CRUISER =new Model("Land Cruiser") ;
    public ToyotaLandCruiser(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(LAND_CRUISER, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
