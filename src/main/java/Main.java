package main.java;

import main.java.pl.edu.pwr.io.lab.gui.ClientManagementFormular;
import main.java.pl.edu.pwr.io.lab.gui.RentingManagementFormular;
import main.java.pl.edu.pwr.io.lab.gui.ReservationManagementFormular;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        showApplication();
    }

    private static void showMainMenu(){
        System.out.println("===========================");
        System.out.println("=== GOLD VHS VIDEO RENT ===");
        System.out.println("===========================");

        System.out.println("\n1 - show client management form.");
        System.out.println("2 - show reservation management form.");
        System.out.println("3 - show renting management form.");
        System.out.println("4 - EXIT");
        System.out.print("> ");
    }

    private static void showApplication(){

        Scanner scanner = new Scanner(System.in);
        showMainMenu();

        String userChoice = scanner.next();

        switch (userChoice)
        {
            case "1":
                ClientManagementFormular clientManagementFormular = new ClientManagementFormular();
                clientManagementFormular.show();
                showApplication();
                break;
            case "2":
                ReservationManagementFormular reservationManagementFormular = new ReservationManagementFormular();
                reservationManagementFormular.show();
                showApplication();
                break;
            case "3":
                RentingManagementFormular rentingManagementFormular = new RentingManagementFormular();
                rentingManagementFormular.show();
                showApplication();
                break;
            case "4":
                System.out.println("Exiting...");
                break;
        }
    }
}
