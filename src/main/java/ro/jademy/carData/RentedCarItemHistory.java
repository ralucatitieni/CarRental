package ro.jademy.carData;

import java.time.LocalDate;

public class RentedCarItemHistory {

    private Car rentedCar;
    private LocalDate pickupDate;
    private LocalDate returnDate;
    private long price;
    private boolean isCurrentlyRented;


    public RentedCarItemHistory(Car rentedCar, LocalDate pickupDate, LocalDate returnDate, long price) {
        this.rentedCar = rentedCar;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.price = price;
    }

    public Car getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(Car rentedCar) {
        this.rentedCar = rentedCar;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        int totalAmount= (int) (returnDate.compareTo(pickupDate)*price/100);
        return rentedCar.toString() + "\n" +
                "Pickup Date: " + pickupDate + "\n" +
                "Return Date: " + returnDate + "\n" +
                "Total Amount: " + totalAmount;
    }
}
