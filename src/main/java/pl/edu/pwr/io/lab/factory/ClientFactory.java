package pl.edu.pwr.io.lab.factory;

import pl.edu.pwr.io.lab.common.Client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ClientFactory {

    public Client createNewClient(String ID,
                                  String name,
                                  String surname,
                                  String personalID,
                                  String birthDate,
                                  String registrationDate){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate dateOfBirth = LocalDate.parse(birthDate, formatter);
        LocalDate dateOfRegistration = LocalDate.parse(registrationDate, formatter);

        return new Client(ID, name, surname, personalID, dateOfBirth, dateOfRegistration);
    }
}
