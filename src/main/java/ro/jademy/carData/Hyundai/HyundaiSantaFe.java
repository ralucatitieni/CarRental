package ro.jademy.carData.Hyundai;

import ro.jademy.carData.Model;

import java.time.LocalDate;

public class HyundaiSantaFe extends Hyundai {

    private static final Model SANTA_FE =new Model("Santa Fe") ;

    public HyundaiSantaFe(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(SANTA_FE, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
