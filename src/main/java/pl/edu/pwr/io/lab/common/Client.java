package main.java.pl.edu.pwr.io.lab.common;

import java.time.LocalDate;

public class Client {

    private String clientID;
    private String name;
    private String surname;
    private String personalIDCardSerial;
    private LocalDate dateOfBirth;
    private LocalDate registrationDate;

    public Client(String clientID,
                  String name,
                  String surname,
                  String personalIDCardSerial,
                  LocalDate dateOfBirth,
                  LocalDate registrationDate) {

        this.clientID = clientID;
        this.name = name;
        this.surname = surname;
        this.personalIDCardSerial = personalIDCardSerial;
        this.dateOfBirth = dateOfBirth;
        this.registrationDate = registrationDate;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalIDCardSerial() {
        return personalIDCardSerial;
    }

    public void setPersonalIDCardSerial(String personalIDCardSerial) {
        this.personalIDCardSerial = personalIDCardSerial;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
