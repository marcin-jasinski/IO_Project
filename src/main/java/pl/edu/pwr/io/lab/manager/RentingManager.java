package pl.edu.pwr.io.lab.manager;

import pl.edu.pwr.io.lab.common.Rent;

import java.util.ArrayList;
import java.util.List;

public class RentingManager {

    List<Rent> rentList = new ArrayList<>();

    public void addRentToList(Rent rent){
        rentList.add(rent);
    }

    public void showReservationsForClient(String clientID){

        boolean clientHasRents = checkIfClientHasRents(clientID);

        if(clientHasRents){
            for(Rent r : rentList){
                System.out.println("\nFilmID: " + r.getFilmItemID() +
                        "\nRent date  : " + r.getRentDate()+
                        "\nReturn date: " + r.getReturnDate());
            }
        } else {
            System.out.println("\nThis client has not rented anything.");
        }
    }

    private boolean checkIfClientHasRents(String clientID) {
        return rentList.stream().anyMatch(r -> r.getClientID().equals(clientID));
    }
}
