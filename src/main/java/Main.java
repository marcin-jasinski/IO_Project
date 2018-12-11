package main.java;

import main.java.pl.edu.pwr.io.lab.gui.ClientManagementForm;
import main.java.pl.edu.pwr.io.lab.gui.RentingManagementFrom;
import main.java.pl.edu.pwr.io.lab.gui.ReservationManagementForm;
import main.java.pl.edu.pwr.io.lab.manager.RentingManager;
import main.java.pl.edu.pwr.io.lab.manager.ReservationManager;

import java.util.Scanner;

public class Main {


    private static RentingManager rentingManager;
    private static ReservationManager reservationManager;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("=== GOLD VHS VIDEO RENT ===");
        System.out.println("===========================");

        System.out.println("\n1 - show client management form.");
        System.out.println("2 - show reservation management form.");
        System.out.println("3 - show renting management form.");
        System.out.print("> ");
        String userChoice = scanner.next();

        switch (userChoice)
        {
            case "1":
                ClientManagementForm clientManagementForm = new ClientManagementForm();
                clientManagementForm.show();
                break;
            case "2":
                ReservationManagementForm reservationManagementForm = new ReservationManagementForm();
                // reservationManagementForm.show();
                break;
            case "3":
                RentingManagementFrom rentingManagementFrom = new RentingManagementFrom();
                // rentingManagementFrom.show();
                break;
        }
    }
}
