package finessefixturetests;

import fit.ColumnFixture;
import pl.edu.pwr.io.lab.common.Client;

import java.util.NoSuchElementException;

public class TestModifyClient extends ColumnFixture {
    String data[];

    public boolean testModifyClientData() throws IndexOutOfBoundsException, NoSuchElementException, IllegalArgumentException {
        try {
        Client updatedClient = SetUp.clientManager.updateClient(data[0],data[1],data[2],data[3]);
        return true;

        } catch (IndexOutOfBoundsException ioobe){
            return false;
        } catch (NoSuchElementException nsee){
            return false;
        } catch (IllegalArgumentException iae){
            return false;
        }
    }
}
