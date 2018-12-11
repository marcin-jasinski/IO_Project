package main.java.pl.edu.pwr.io.lab.gui;

import main.java.pl.edu.pwr.io.lab.factory.ClientFactory;
import main.java.pl.edu.pwr.io.lab.manager.ClientManager;
import main.java.pl.edu.pwr.io.lab.person.Client;

import java.time.LocalDate;
import java.util.Scanner;

public class ClientManagementForm {

    private ClientManager clientManager = new ClientManager();

    private void showMenu(){
        System.out.println("\n+++ Client Management Form +++");
        System.out.println("1 - show all clients data");
        System.out.println("2 - show selected client data");
        System.out.println("3 - add new client");
        System.out.println("4 - modify client data");
        System.out.println("5 - EXIT");
        System.out.print("> ");
    }

    public void show() {

        Scanner scanner = new Scanner(System.in);

        showMenu();
        String userChoice = scanner.next();

        switch (userChoice)
        {
            case "1":
                clientManager.showAllClientData();
                show();
                break;
            case "2":
                scanner.nextLine();
                System.out.println("\nClientID: ");
                String clientID = scanner.nextLine();
                clientManager.showClientData(clientID);
                show();
                break;
            case "3":
                addNewClient();
                show();
                break;
            case "4":
                // modifyCustomerData();
                show();
                break;
            case "5":
                System.out.println("Saving application data...");
                System.out.println("Exiting...");
                break;
        }
    }

    private void addNewClient(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter new client data:");
        System.out.print("ClientID: ");
        String newClientID = scanner.nextLine();
        System.out.print("Name: ");
        String newClientName = scanner.nextLine();
        System.out.print("Surname: ");
        String newClientSurname = scanner.nextLine();
        System.out.print("Personal ID: ");
        String newClientPersonalID = scanner.nextLine();
        System.out.print("Date of Birth: ");
        String newClientBirthDate = scanner.nextLine();
        String registrationDate = LocalDate.now().toString();

        ClientFactory clientFactory = new ClientFactory();

        Client newClient = clientFactory.createNewClient(//
                newClientID,
                newClientName,
                newClientSurname,
                newClientPersonalID,
                newClientBirthDate,
                registrationDate);

        clientManager.addNewClient(newClient);
        System.out.println("\nNew client added to database: ");
        clientManager.showClientData(newClientID);
    }
}
