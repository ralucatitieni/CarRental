package ro.jademy.shop;

import ro.jademy.dataSource.AllUsers;
import ro.jademy.services.AuthService;
import ro.jademy.services.FilterService;
import ro.jademy.services.FilterServiceImpl;
import ro.jademy.services.MemoryAuthServiceImpl;
import ro.jademy.userData.*;
import ro.jademy.carData.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    static Scanner sc = new Scanner(System.in);

    private List<Car> cars;
    private List<User> users;    //aici poate fi orice, de la clienti, la admini

    private User currentUser;    // TODO: 8/17/2020  currentUer devine null la logout

    private AuthService authService = new MemoryAuthServiceImpl();
    private FilterService filterService = new FilterServiceImpl();


    public Shop(List<Car> cars, List<User> users) {
        this.cars = cars;
        this.users = users;
    }



    public void login() {
        do {
            System.out.println("Enter username: ");
            String username = sc.next();
            System.out.println("Enter password: ");
            String password = sc.next();
            User userToBeLoggedIn = new User(username, password);

            currentUser = authService.login(users, userToBeLoggedIn);   //current user is checked in the AuthService class
            if (currentUser == null) {
                System.out.println("Incorrect username/password! ");
            }
        } while (currentUser == null);

        System.out.println("Login successful");

        if (currentUser.isAdmin()) {
            showAdminMenu();
        } else {
            showClientMenu();
        }
    }

    public void logout(){
        System.out.println("Are you sure you want to logout? Y");
        String option=sc.next();
        if(option.equalsIgnoreCase("Y")){
            currentUser=null;
        }
    }

    public void showAdminMenu() {
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. List all users");
        System.out.println("5. Check income");
        System.out.println("6. Search for a certain car");
        System.out.println("7. Search for a certain user");
        System.out.println("8. Logout");
        System.out.println("9. Exit");
    }

    public void showClientMenu() {
        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. Filter cars");
        System.out.println("4. Rent a car");
        System.out.println("5. Show car history");
        System.out.println("6. Logout");
        System.out.println("7. Exit");
    }

    public void showCarFilterOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by years");
        System.out.println("4. Filter by fuel type");
        System.out.println("5. Filter by price");
        System.out.println("6. Filter by number of doors");
        System.out.println("7. Filter by number of seats");
        System.out.println("8. Back to previous menu");

    }

    public void chooseCarFilterOption(int option) {
        int option2;
        switch (option) {
            case 1:
                System.out.println("1. Add another filter");
                System.out.println("2. Display cars");
                option2 = sc.nextInt();
                switch (option2) {
                    case 1:
                        showCarFilterOptions();
                        break;
                    case 2:
                        showAllCars();
                        System.out.println("Enter a make:");
                        String make = sc.next();
                        showAllCars(filterService.filterByMake(cars, make));
                        break;
                }
                break;
            case 2:
                System.out.println("1. Add another filter");
                System.out.println("2. Display cars");
                option2 = sc.nextInt();
                switch (option2) {
                    case 1:
                        showCarFilterOptions();
                        break;
                    case 2:
                        showAllCars();
                        System.out.println("Enter a model:");
                        String model = sc.next();
                        showAllCars(filterService.filterByModel(cars, model));
                        break;
                }
                break;

            case 3:
                System.out.println("1. Add another filter");
                System.out.println("2. Display cars");
                option2 = sc.nextInt();
                switch (option2) {
                    case 1:
                        showCarFilterOptions();
                        break;
                    case 2:
                        showAllCars();
                        System.out.println("Enter boundary years:");
                        System.out.println("First year");
                        int minYear = sc.nextInt();
                        System.out.println("Second year");
                        int maxYear = sc.nextInt();
                        showAllCars(filterService.filterByYears(cars, minYear, maxYear));
                        break;
                }
                break;
            case 4:
                System.out.println("1. Add another filter");
                System.out.println("2. Display cars");
                option2 = sc.nextInt();
                switch (option2) {
                    case 1:
                        showCarFilterOptions();
                        break;
                    case 2:
                        showAllCars();
                        System.out.println("Enter a fuel type:");
                        String fuelType = sc.next();
                        showAllCars(filterService.filterByModel(cars, fuelType));
                        break;
                }
                break;
            case 5:
                System.out.println("1. Add another filter");
                System.out.println("2. Display cars");
                option2 = sc.nextInt();
                switch (option2) {
                    case 1:
                        showCarFilterOptions();
                        break;
                    case 2:
                        showAllCars();
                        System.out.println("Enter boundary prices:");
                        System.out.println("Minimum price");
                        int minYear = sc.nextInt();
                        System.out.println("Second year");
                        int maxYear = sc.nextInt();
                        showAllCars(filterService.filterByPrice(cars, minYear, maxYear));
                        break;
                }
                break;
            case 6:
                System.out.println("1. Add another filter");
                System.out.println("2. Display cars");
                option2 = sc.nextInt();
                switch (option2) {
                    case 1:
                        showCarFilterOptions();
                        break;
                    case 2:
                        showAllCars();
                        System.out.println("Enter the number of doors:");
                        int noOfDoors = sc.nextInt();
                        showAllCars(filterService.filterByNoOfDoors(cars, noOfDoors));
                        break;
                }
                break;
            case 7:
                System.out.println("1. Add another filter");
                System.out.println("2. Display cars");
                option2 = sc.nextInt();
                switch (option2) {
                    case 1:
                        showCarFilterOptions();
                        break;
                    case 2:
                        showAllCars();
                        System.out.println("Enter the number of seats:");
                        int noOfSeats = sc.nextInt();
                        showAllCars(filterService.filterByNoOfDoors(cars, noOfSeats));
                        break;
                }
                break;
            case 8:
                showClientMenu();
            default:
                System.out.println("Enter a valid option");
        }
    }

    public void chooseAdminMenuOption(int option) {
        switch (option) {
            case 1:
                System.out.println("LIST ALL CARS");
                showAllCars();

                break;
            case 2:
                // TODO: 8/12/2020 print available cars   //sunt care care au un boolean isRented false??
                break;

            case 3:// TODO: 8/12/2020 print rented cars  //care au boolean is Rented true/
                break;
            case 4:
                // TODO: 8/12/2020 list car history


                break;
            case 5:
                // TODO: 8/12/2020 check income
                break;
            case 6:
                System.out.println("Enter a car ID:");
                String id = sc.next();
                showAllCars(filterService.filterById(cars, id));
                break;
            case 7:
                // TODO: 8/12/2020 search in "users"
                break;
            case 8:
                // TODO: 8/16/2020 logout ;

            case 9:
                // TODO: 8/16/2020 exit;
            default:
                System.out.println("Unknown command");
                break;
        }
    }

    public void chooseClientMenuOption(int option) {
        switch (option) {
            case 1:
                System.out.println("LIST ALL CARS");
                showAllCars();

                break;
            case 2:
                System.out.println("List all available cars");
                // TODO: 8/12/2020 print available cars   //sunt care care au un boolean isRented false??
                break;

            case 3:
                showCarFilterOptions();
                System.out.println("Enter an option:");
                int filteringOption = sc.nextInt();
                chooseCarFilterOption(filteringOption);
                // TODO: 8/17/2020     rentCar();
                break;
            case 4:
                // TODO: 8/17/2020  rentCar();
                break;
            case 5:
                // TODO: 8/16/2020 show car history
                //the rented car list is in the client class---->do I need to declare the client list as a property of this class?

                break;

            case 6:
                // TODO: 8/16/2020 logout ;

            case 7:
                // TODO: 8/16/2020 exit;
            default:
                System.out.println("Unknown command");
                break;
        }
    }

    public void showAllCars() {    //metoda care printeaza masini
        showAllCars(cars);
    }


    public void showAllCars(List<Car> cars) {
        //printeaza toate masinile frumo aranjate;

        for (int i = 0; i < cars.size(); i++) {
            if (i < 10) {
                System.out.println((i + 1) + ".  " + cars.get(i).toString());
            } else {
                System.out.println((i + 1) + ". " + cars.get(i).toString());
            }
        }
    }

    public void showAllUsers(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            if (i < 10) {
                System.out.println((i + 1) + ".  " + users.get(i).toString());
            } else {
                System.out.println((i + 1) + ". " + users.get(i).toString());
            }
        }
    }


    private List<RentedCar> getCurrentlyRentedCars() {
        List<RentedCar> rentedCars = new ArrayList<>();
        for (User user : users) {
            //      rentedCars.addAll(user.getCurrentlyRentedCars())
            RentedCar currentCar = user.getRentedCar();
            if (currentCar != null) {
                rentedCars.add(currentCar);
            }
        }
        return rentedCars;
    }


    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}


