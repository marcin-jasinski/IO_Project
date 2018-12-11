package main.java.pl.edu.pwr.io.lab.common;

import java.time.LocalDate;

public class Rent {

    private String rentNumber;
    private String clientID;
    private String employeeID;
    private String filmItemID;
    private LocalDate rentDate;
    private LocalDate returnDate;
    private int returnDelay;

    public Rent(String rentNumber, String clientID, String employeeID, String filmItemID, LocalDate rentDate, LocalDate returnDate, int returnDelay) {
        this.rentNumber = rentNumber;
        this.clientID = clientID;
        this.employeeID = employeeID;
        this.filmItemID = filmItemID;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.returnDelay = returnDelay;
    }

    public String getFilmItemID() {
        return filmItemID;
    }

    public void setFilmItemID(String filmItemID) {
        this.filmItemID = filmItemID;
    }

    public String getRentNumber() {
        return rentNumber;
    }

    public void setRentNumber(String rentNumber) {
        this.rentNumber = rentNumber;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getReturnDelay() {
        return returnDelay;
    }

    public void setReturnDelay(int returnDelay) {
        this.returnDelay = returnDelay;
    }
}
