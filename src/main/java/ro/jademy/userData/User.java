package ro.jademy.userData;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class User {

    // TODO: 8/6/2020  : add user properties, constructors, sub-classes
    //two branches - salesmen
    //             - customers

    protected String name;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected boolean isAdmin;
    protected RentedCar rentedCar;
    public User (String name, String password){
        this.name=name;
        this.password=password;
    }


    public User(String name, String password, String firstName, String lastName) {
        this.name = name;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isAdmin() {
            return isAdmin;
        }

        public void setAdmin(boolean admin) {
            isAdmin = admin;
        }

    public RentedCar getRentedCar() {
        return rentedCar;
    }

    public void setRentedCar(RentedCar rentedCar) {
        this.rentedCar = rentedCar;
    }

    @Override

    public String toString() {
        return "User {" +
                "First Name=' " + firstName + '\'' +
                ", Last Name=" + lastName +
                '}';
    }


    // TODO: 8/12/2020 get a user's current rented car 
}
