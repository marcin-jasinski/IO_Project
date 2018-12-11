package main.java.pl.edu.pwr.io.lab.manager;

import main.java.pl.edu.pwr.io.lab.person.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ClientManager {

    List<Client> clientList = new ArrayList<>();

    public void showAllClientData(){
        for(Client c : clientList){
            showClientData(c.getClientID());
        }
    }

    public void showClientData(String clientID){

        boolean clientExists = checkIfClientExists(clientID);

        if(clientExists) {
            int clientIndex = getClientIndex(clientID);
            Client c = clientList.get(clientIndex);
            System.out.println("\nClient ID: " + clientID +
                    "\nName" + c.getName() +
                    "\nSurname" + c.getSurname() +
                    "\nPersonalID: " + c.getClientID() +
                    "\nDate of birth: " + c.getDateOfBirth() +
                    "\nRegistration date: " + c.getRegistrationDate());
        }
    }

    public void addNewClient(Client newClient){
        clientList.add(newClient);
    }

    public boolean checkIfClientExists(String clientID) {
        return clientList.stream().anyMatch(c -> c.getClientID().equals(clientID));
    }

    private int getClientIndex(String clientID){
        return IntStream.range(0, clientList.size())
                .filter(i -> clientID.equals(clientList.get(i)))
                .findFirst().getAsInt();
    }
}
