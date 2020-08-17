package ro.jademy.userData;

import ro.jademy.carData.Car;

public class RentedCar {
    private Car rentedCar;


    public RentedCar(Car rentedCar){
        this.rentedCar=rentedCar;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
    }
}
