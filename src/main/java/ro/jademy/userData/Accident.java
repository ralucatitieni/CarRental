package ro.jademy.userData;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Accident {

    private String typeOfAccident;
    private LocalDateTime dateOfAccident;

    public Accident(String typeOfAccident, LocalDateTime dateOfAccident){
        this.typeOfAccident=typeOfAccident;
        this.dateOfAccident=dateOfAccident;
    }

}
