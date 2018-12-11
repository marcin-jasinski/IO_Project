package main.java.pl.edu.pwr.io.lab.gui;

import main.java.pl.edu.pwr.io.lab.factory.ClientFactory;
import main.java.pl.edu.pwr.io.lab.manager.ClientManager;
import main.java.pl.edu.pwr.io.lab.common.Client;

import java.time.LocalDate;
import java.util.Scanner;

public class ClientManagementFormular {

    private ClientManager clientManager = new ClientManager();
    private Scanner scanner = new Scanner(System.in);

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

        showMenu();
        String userChoice = scanner.next();

        switch (userChoice)
        {
            case "1":
                clientManager.showAllClientData();
                show();
                break;
            case "2":
                showClientData();
                show();
                break;
            case "3":
                addNewClient();
                show();
                break;
            case "4":
                modifyClientData();
                show();
                break;
            case "5":
                System.out.println("Saving application data...");
                System.out.println("Exiting...");
                break;
        }
    }

    private void showClientData(){
        System.out.println("\nClientID: ");
        scanner.nextLine();
        String clientID = scanner.nextLine();
        clientManager.showClientData(clientID);
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

    private void modifyClientData(){

        System.out.println("\nClientID: ");
        scanner.nextLine();
        String clientID = scanner.nextLine();

        boolean clientExists = clientManager.checkIfClientExists(clientID);
        if(clientExists){
            System.out.println("\nCurrent client data: ");
            clientManager.showClientData(clientID);

            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter new client data:");
            System.out.print("Name: ");
            String newName = scanner.nextLine();
            System.out.print("Surname: ");
            String newSurname = scanner.nextLine();
            System.out.print("Personal ID: ");
            String newPersonalID = scanner.nextLine();

            clientManager.updateClient(clientID, newName, newSurname, newPersonalID);

            System.out.println("\nUpdated client data:");
            clientManager.showClientData(clientID);
        } else {
            System.out.println("\nThere is no such client in the database.");
        }
    }
}
