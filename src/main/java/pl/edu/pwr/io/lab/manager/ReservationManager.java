package main.java.pl.edu.pwr.io.lab.manager;

import main.java.pl.edu.pwr.io.lab.common.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {

    private List<Reservation> reservationList = new ArrayList<>();

    public void showReservationsForClient(String clientID){

        boolean clientHasReservations = reservationList.stream().anyMatch(r -> r.getClientID().equals(clientID));

        if(clientHasReservations){
            for(Reservation r : reservationList){
                if(r.getClientID().equals(clientID)){
                    r.showReservation();
                }
            }
        } else {
            System.out.println("\nThere are no reservations for this client");
        }
    }
}
