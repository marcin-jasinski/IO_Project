package main.java;

import main.java.pl.edu.pwr.io.lab.gui.ClientManagementFormular;
import main.java.pl.edu.pwr.io.lab.gui.RentingManagementFromular;
import main.java.pl.edu.pwr.io.lab.gui.ReservationManagementFormular;
import main.java.pl.edu.pwr.io.lab.manager.ClientManager;
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
                ClientManagementFormular clientManagementFormular = new ClientManagementFormular();
                clientManagementFormular.show();
                break;
            case "2":
                ReservationManagementFormular reservationManagementFormular = new ReservationManagementFormular();
                // reservationManagementFormular.show();
                break;
            case "3":
                RentingManagementFromular rentingManagementFromular = new RentingManagementFromular();
                // rentingManagementFromular.show();
                break;
        }
    }
}
