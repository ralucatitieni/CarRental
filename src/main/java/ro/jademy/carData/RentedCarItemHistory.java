package ro.jademy.carData;
import ro.jademy.carData.*;
import java.time.LocalDate;

public class RentedCarItemHistory {

    private  Car car;
    private LocalDate pickupDate;
    private LocalDate returnDate;
    private boolean isCurrentlyRented;
    private int price;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car=car;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isCurrentlyRented() {
        return isCurrentlyRented;
    }

    public void setCurrentlyRented(boolean currentlyRented) {
        isCurrentlyRented = currentlyRented;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
