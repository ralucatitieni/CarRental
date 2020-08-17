package ro.jademy;

import ro.jademy.carData.Car;
import ro.jademy.carData.Dacia.DaciaDokker;
import ro.jademy.dataSource.AllUsers;
import ro.jademy.dataSource.CarsInShop;
import ro.jademy.shop.Shop;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


Shop ralucasShop=new Shop(CarsInShop.allCars(),AllUsers.getAllUsers());



    }
}

//