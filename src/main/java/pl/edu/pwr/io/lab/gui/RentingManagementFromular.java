package main.java.pl.edu.pwr.io.lab.gui;

import main.java.pl.edu.pwr.io.lab.common.Rent;
import main.java.pl.edu.pwr.io.lab.manager.RentingManager;
import java.time.LocalDate;
import java.util.Scanner;

public class RentingManagementFromular {

    private RentingManager rentingManager = new RentingManager();
    private Scanner scanner = new Scanner(System.in);

    private void showMenu(){
        System.out.println("\n+++ Renting Management Form +++");
        System.out.println("1 - rent film to a client");
        System.out.println("2 - show rent list for a client");
        System.out.println("2 - EXIT");
        System.out.print("> ");
    }

    public void show() {

        showMenu();
        String userChoice = scanner.next();

        switch (userChoice)
        {
            case "1":
                addNewRentToClient();
                show();
                break;
            case "2":
                showRentListForClient();
                show();
                break;
            case "3":
                break;
        }
    }

    private void addNewRentToClient(){

        System.out.println("\nEmployee ID: ");
        scanner.nextLine();
        String employeeID = scanner.nextLine();

        System.out.println("\nClientID: ");
        String clientID = scanner.nextLine();

        System.out.println("\nFilm item ID: ");
        String filmItemID = scanner.nextLine();

        System.out.println("\nRent number: ");
        String rentNumber = scanner.nextLine();

        LocalDate rentDate = LocalDate.now();
        LocalDate returnDate = rentDate.plusDays(14);
        int returnDelay = 0;

        Rent rentToAdd = new Rent(rentNumber, clientID, employeeID, filmItemID, rentDate, returnDate, returnDelay);
        rentingManager.addRentToList(rentToAdd);
        System.out.println("New reservation added for client:");
        rentingManager.showReservationsForClient(clientID);
    }

    private void showRentListForClient(){

        System.out.println("\nClientID: ");
        scanner.nextLine();
        String clientID = scanner.nextLine();

        rentingManager.showReservationsForClient(clientID);
    }
}
