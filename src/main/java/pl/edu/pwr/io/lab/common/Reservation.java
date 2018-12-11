package main.java.pl.edu.pwr.io.lab.common;

import main.java.pl.edu.pwr.io.lab.film.FilmItem;

import java.time.LocalDate;

public class Reservation {

    private int reservationNumber;
    private String clientID;
    private int employeeNumber;
    private LocalDate reservationDate;
    private LocalDate reservationDue;
    private FilmItem filmItem;

    public Reservation(int reservationNumber,
                       String clientID,
                       int employeeNumber,
                       LocalDate reservationDate,
                       LocalDate reservationDue,
                       FilmItem filmItem) {

        this.reservationNumber = reservationNumber;
        this.clientID = clientID;
        this.employeeNumber = employeeNumber;
        this.reservationDate = reservationDate;
        this.reservationDue = reservationDue;
        this.filmItem = filmItem;
    }

    public void showReservation(){

        System.out.println("\nReservation number: " + reservationNumber +
                "\nClientID: " + clientID +
                "\nReservation date: " + reservationDate +
                "\nReservation due : " + getReservationDue() +
                "\nReserved film item: " + filmItem.getItemNumer());
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getReservationDue() {
        return reservationDue;
    }

    public void setReservationDue(LocalDate reservationDue) {
        this.reservationDue = reservationDue;
    }

    public FilmItem getFilmItem() {
        return filmItem;
    }

    public void setFilmItem(FilmItem filmItem) {
        this.filmItem = filmItem;
    }
}
