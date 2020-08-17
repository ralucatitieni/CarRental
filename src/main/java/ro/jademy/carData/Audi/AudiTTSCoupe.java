package ro.jademy.carData.Audi;

import ro.jademy.carData.Car;
import ro.jademy.carData.Model;

import java.time.LocalDate;

public class AudiTTSCoupe extends Audi {
    private static final Model TTSCOUPE =new Model("TTS Coupe") ;
    public AudiTTSCoupe(LocalDate year, String fuelType, long price, int noOfDoors, int noOfSeats) {
        super(TTSCOUPE, year, fuelType, price, noOfDoors, noOfSeats);
    }
}
