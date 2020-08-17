package ro.jademy.userData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client extends User {


    private LocalDate birthDate;
    private LocalDate licenseDate;
private List<RentedCar> rentedCars=new ArrayList<>();
private List<Accident> accidents=new ArrayList<>();


    public Client(String name, String password,String firstName, String lastName,LocalDate birthDate, LocalDate licenseDate){
        super(name, password,firstName, lastName);
        this.birthDate =birthDate;
        this.licenseDate = licenseDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(LocalDate licenseDate) {
        this.licenseDate = licenseDate;
    }

    public List<RentedCar> getRentedCars(){
        return rentedCars;
    }


    public List<Accident> getAccidents(){
        return accidents;
    }

    public void setAccidents(List<Accident> accidents) {
        this.accidents = accidents;
    }


    // TODO: 8/16/2020 calculate number of days
    // TODO: 8/16/2020 calculate amount to be paid
    // TODO: 8/16/2020 apply a discount for each client
}
