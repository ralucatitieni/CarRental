package ro.jademy.services;

import ro.jademy.carData.Car;

import java.time.LocalDate;
import java.util.List;

public interface FilterService {



    List<Car> filterByMake(List<Car> carList, String make);
    List<Car> filterByModel(List<Car> carList, String model);
    List<Car> filterByYears(List<Car> carList, int minYear, int maxYear);
    List<Car> filterByFuelType(List<Car> carList, String fuelType);
    List<Car> filterByPrice(List<Car> carList, long minPrice, long maxPrice);
    List<Car> filterByNoOfDoors(List<Car> carList, int noOfDoors);
    List<Car> filterByNoOfSeats(List<Car> carList, int noOfSeats);
    List<Car> filterById(List<Car> carList, String id);
}
