package ro.jademy.carData.Hyundai;

import ro.jademy.carData.Model;

import java.time.LocalDate;

public class HyundaiKona extends Hyundai {

    private static final Model KONA =new Model("Kona") ;

    public HyundaiKona(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(KONA, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
