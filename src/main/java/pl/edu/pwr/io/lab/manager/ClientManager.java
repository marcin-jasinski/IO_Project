package main.java.pl.edu.pwr.io.lab.manager;

import main.java.pl.edu.pwr.io.lab.common.Client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ClientManager {

    private List<Client> clientList;

    public ClientManager() {
        this.clientList = new ArrayList<>();
        clientList.add(
                new Client("123",
                "Jan",
                "Kowalski",
                "AWFPWR666",
                        LocalDate.of(1970, 10, 15),
                        LocalDate.of(2018, 05, 12)));
        clientList.add(
                new Client("666",
                        "Tomasz",
                        "Nowak",
                        "AGHSGGW42",
                        LocalDate.of(1989, 05, 05),
                        LocalDate.of(2017, 12, 10)));
    }

    public void showAllClientData(){
        if(clientList.isEmpty()) System.out.println("\nThere are no clients in the database");
        else {

            for(Client c : clientList){
                showClientData(c.getClientID());
            }
        }
    }

    public void showClientData(String clientID){

        if(Integer.parseInt(clientID) < 0){
            throw new IndexOutOfBoundsException("Client index out of bounds.");
        }

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
            throw new NoSuchElementException("There is no such client in the database.");
        }
    }

    public void addNewClient(Client newClient){
        clientList.add(newClient);
    }

    public Client updateClient(String clientID, String name, String surname, String personalID){

        if(Integer.parseInt(clientID) < 0){
            throw new IndexOutOfBoundsException("Client index out of bounds.");
        }

        if(personalID == null || personalID.isEmpty()) {
            throw new IllegalArgumentException("PersonalID cannot be null");
        }

        Client clientToUpdate = null;
        boolean clientExists = checkIfClientExists(clientID);

        if(clientExists){
            int clientIndex = getClientIndex(clientID).getAsInt();
            clientToUpdate = clientList.get(clientIndex);
            clientToUpdate.setName(name);
            clientToUpdate.setSurname(surname);
            clientToUpdate.setPersonalIDCardSerial(personalID);
        } else {
            throw new NoSuchElementException("There is no such client in the database.");
        }

        return clientToUpdate;
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
