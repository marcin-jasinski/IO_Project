package main.java.pl.edu.pwr.io.lab.gui;

import main.java.pl.edu.pwr.io.lab.factory.ClientFactory;
import main.java.pl.edu.pwr.io.lab.manager.ClientManager;
import main.java.pl.edu.pwr.io.lab.person.Client;

import java.time.LocalDate;
import java.util.Scanner;

public class ClientManagementFormular {

    private ClientManager clientManager = new ClientManager();

    public void show() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("+++ Client Management Form +++");
        System.out.println("1 - show all clients data");
        System.out.println("2 - show selected client data");
        System.out.println("3 - add new client");
        System.out.println("4 - modify client data");
        System.out.print("> ");
        String userChoice = scanner.next();

        switch (userChoice)
        {
            case "1":
                clientManager.showAllClientData();
                break;
            case "2":
                System.out.println("\nClientID: ");
                String clientID = scanner.nextLine();
                clientManager.showClientData(clientID);
                break;
            case "3":
                addNewClient();
                break;
            case "4":
                // modifyCustomerData();
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
    }
}
