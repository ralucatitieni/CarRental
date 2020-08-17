package ro.jademy.dataSource;

import java.time.LocalDate;

import ro.jademy.userData.*;


import java.util.ArrayList;
import java.util.List;

public class AllUsers {


    public static List<User> getAllAdmins() {
        List<User> allAdmins = new ArrayList<>();

        //add some allAdmins --admins and clients


        User admin1 = new Admin("raluca1", "1234", "Raluca", "Titieni1");
        admin1.setAdmin(true);
        User admin2 = new Admin("raluca2", "5678", "Raluca", "Titieni2");
        admin2.setAdmin(true);
        User admin3 = new Admin("raluca3", "0000", "Raluca", "Titieni3");
        admin3.setAdmin(true);

        allAdmins.add(admin1);
        allAdmins.add(admin2);
        allAdmins.add(admin3);
        return allAdmins;

    }


    public static List<User> getAllClients() {
        List<User> allClients = new ArrayList<>();
        User client1 = new Client("client1", "1234", "Ion", "Iliescu", LocalDate.of(1930, 3, 3), LocalDate.of(1950, 3, 3));
        client1.setAdmin(false);
        User client2 = new Client("client2", "5678", "Emil", "Constantinescu", LocalDate.of(1939, 11, 19), LocalDate.of(1960, 3, 3));
        client2.setAdmin(false);
        User client3 = new Client("client3", "8765", "Traian", "Basescu", LocalDate.of(1951, 11, 4), LocalDate.of(1970, 3, 3));
        client3.setAdmin(false);
        User client4 = new Client("client4", "4321", "Klaus", "Iohannis", LocalDate.of(1959, 06, 13), LocalDate.of(1980, 3, 3));
        client4.setAdmin(false);


        allClients.add(client1);
        allClients.add(client2);
        allClients.add(client3);
        allClients.add(client4);
        return allClients;
    }


    public static  List<User> getAllUsers() {
        List<User> allUsers = new ArrayList<>();
        allUsers.addAll(getAllAdmins());
        allUsers.addAll(getAllClients());

        return allUsers;
    }

}
