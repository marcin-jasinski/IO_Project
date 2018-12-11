package main.java.pl.edu.pwr.io.lab.manager;

import main.java.pl.edu.pwr.io.lab.person.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ClientManager {

    List<Client> clientList = new ArrayList<>();

    public void showAllClientData(){
        if(clientList.isEmpty()) System.out.println("\nThere are no clients in the database");
        else {

            for(Client c : clientList){
                showClientData(c.getClientID());
            }
        }
    }

    public void showClientData(String clientID){

        boolean clientExists = checkIfClientExists(clientID);

        if(clientExists) {
            int clientIndex = getClientIndex(clientID).getAsInt();
            Client c = clientList.get(clientIndex);
            System.out.println("\nClient ID: " + clientID +
                    "\nName: " + c.getName() +
                    "\nSurname: " + c.getSurname() +
                    "\nPersonalID: " + c.getClientID() +
                    "\nDate of birth: " + c.getDateOfBirth() +
                    "\nRegistration date: " + c.getRegistrationDate());
        } else {
            System.out.println("There is no such client in the database.");
        }
    }

    public void addNewClient(Client newClient){
        clientList.add(newClient);
    }

    public void updateClient(String clientID, String name, String surname, String personalID){

        boolean clientExists = checkIfClientExists(clientID);

        if(clientExists){
            int clientIndex = getClientIndex(clientID).getAsInt();
            Client clientToUpdate = clientList.get(clientIndex);
            clientToUpdate.setName(name);
            clientToUpdate.setSurname(surname);
            clientToUpdate.setPersonalIDCardSerial(personalID);
        } else {
            System.out.println("There is no such client in the database.");
        }
    }

    public boolean checkIfClientExists(String clientID) {
        return clientList.stream().anyMatch(c -> c.getClientID().equals(clientID));
    }

    private OptionalInt getClientIndex(String clientID){
        return IntStream.range(0, clientList.size())
                .filter(i -> clientID.equals(clientList.get(i).getClientID()))
                .findFirst();
    }
}
