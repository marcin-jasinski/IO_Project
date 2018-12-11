package main.java.pl.edu.pwr.io.lab.gui;

import main.java.pl.edu.pwr.io.lab.manager.ReservationManager;

import java.util.Scanner;

public class ReservationManagementFormular {

    private ReservationManager reservationManager = new ReservationManager();
    private Scanner scanner = new Scanner(System.in);

    private void showMenu(){
        System.out.println("\n+++ Reservation Management Form +++");
        System.out.println("1 - show reservations for client");
        System.out.println("2 - add reservation for client");
        System.out.println("3 - delete reservation for client");
        System.out.println("4 - modify reservation for client");
        System.out.println("5 - EXIT");
        System.out.print("> ");
    }

    public void show() {

        showMenu();
        String userChoice = scanner.next();

        switch (userChoice)
        {
            case "1":
                showClientReservations();
                show();
                break;
            case "2":
                System.out.println("This functionality is not available");
                show();
                break;
            case "3":
                System.out.println("This functionality is not available");
                show();
                break;
            case "4":
                System.out.println("This functionality is not available");
                show();
                break;
            case "5":
                System.out.println("Saving application data...");
                System.out.println("Exiting...");
                break;
        }
    }

    private void showClientReservations(){
        System.out.println("\nClientID: ");
        scanner.nextLine();
        String clientID = scanner.nextLine();
        reservationManager.showReservationsForClient(clientID);
    }
}
