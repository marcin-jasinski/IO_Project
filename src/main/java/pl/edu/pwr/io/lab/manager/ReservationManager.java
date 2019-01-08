package main.java.pl.edu.pwr.io.lab.manager;

import main.java.pl.edu.pwr.io.lab.common.Reservation;
import main.java.pl.edu.pwr.io.lab.film.FilmItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReservationManager {

    private List<Reservation> reservationList;

    public ReservationManager() {

        this.reservationList = new ArrayList<>();

        reservationList.add(new Reservation(
                "1251532",
                "123",
                000241224, LocalDate.of(2018, 11, 12),
                LocalDate.of(2018, 11, 26), new FilmItem(15122, FilmItem.ItemStatus.RESERVED,
                FilmItem.Media.BLURAY)));
    }

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

    public boolean deleteReservation(String reservationID){

        if(Integer.parseInt(reservationID) < 0){
            throw new IndexOutOfBoundsException("Incorrect reservationID.");
        }

        int reservationIndex = getReservationIndex(reservationID).getAsInt();
        reservationList.remove(reservationIndex);
        System.out.println("\nReservation deleted!");
        return true;
    }

    private OptionalInt getReservationIndex(String reservationID){
        return IntStream.range(0, reservationList.size())
                .filter(i -> reservationID.equals(reservationList.get(i).getReservationNumber()))
                .findFirst();
    }
}
