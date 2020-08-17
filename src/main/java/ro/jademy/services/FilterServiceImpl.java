package ro.jademy.services;

import ro.jademy.dataSource.AllUsers;
import ro.jademy.carData.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FilterServiceImpl implements FilterService {
//SCHIBA TOATE METODELE CA SA RETURNZE LISTE DE MASINI //// IN SHOP LE VA AFISA


    //aici facem exclusiv sortare ---- vor returna liste de masini


    @Override
    public List<Car> filterByMake(List<Car> carList, String make) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (make.equalsIgnoreCase(car.getMake().getName())) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    @Override
    public List<Car> filterByModel(List<Car> carList, String model) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (model.equalsIgnoreCase(car.getModel().getName())) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    @Override
    public List<Car> filterByYears(List<Car> carList, int minYear, int maxYear) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (minYear <= car.getYear().getYear() && maxYear >= car.getYear().getYear()) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    @Override
    public List<Car> filterByFuelType(List<Car> carList, String fuelType) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (fuelType.equalsIgnoreCase(car.getFuelType())) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    @Override
    public List<Car> filterByPrice(List<Car> carList, long minPrice, long maxPrice) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (minPrice <= car.getPrice() && maxPrice >= car.getPrice()) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    @Override
    public List<Car> filterByNoOfDoors(List<Car> carList, int noOfDoors) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (noOfDoors == car.getNoOfDoors()) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    @Override
    public List<Car> filterByNoOfSeats(List<Car> carList, int noOfSeats) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (noOfSeats == car.getNoOfSeats()) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public List<Car> filterById(List<Car> carList, String id) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : carList) {
            if (id.equalsIgnoreCase(car.getFuelType())) {
                filteredCars.add(car);
            }
        }
        return filteredCars;

    }
}
