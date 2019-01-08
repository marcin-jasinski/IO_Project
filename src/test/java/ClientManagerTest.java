import org.junit.Test;
import pl.edu.pwr.io.lab.manager.ClientManager;
import pl.edu.pwr.io.lab.common.Client;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by Marcin on 08.01.2019
 */
public class ClientManagerTest {

    private ClientManager clientManager = new ClientManager();

    @Test
    public void testClientUpdateCorrectID(){

        // given
        String clientID = "123";

        // when
        Client updatedClient = clientManager.updateClient(clientID, "Ignacy", "Krasicki", "BTS456");

        // then
        assertNotNull(updatedClient);
        assertEquals("Ignacy", updatedClient.getName());
        assertEquals("Krasicki", updatedClient.getSurname());
        assertEquals("BTS456", updatedClient.getPersonalIDCardSerial());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testClientUpdateNegativeID(){

        // given
        String clientID = "-1";

        // when
        Client updatedClient = clientManager.updateClient(clientID, "Ignacy", "Krasicki", "BTS456");

        // then
        assertNull(updatedClient);
    }

    @Test(expected = NoSuchElementException.class)
    public void testClientUpdateNonExistentID(){

        // given
        String clientID = "112412";

        // when
        Client updatedClient = clientManager.updateClient(clientID,"Ignacy", "Krasicki", "BTS456");

        // then
        assertNull(updatedClient);
    }

    @Test
    public void testUpdateClientNullName(){

        // given
        String clientID = "123";

        // when
        Client updatedClient = clientManager.updateClient(clientID, null, null, "BTS456");

        // then
        assertNotNull(updatedClient);
        assertNull(updatedClient.getName());
        assertNull(updatedClient.getSurname());
        assertEquals("BTS456", updatedClient.getPersonalIDCardSerial());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateClientNullPersonalID(){

        // given
        String clientID = "123";

        // when
        Client updatedClient = clientManager.updateClient(clientID, "Ignacy", "Krasicki", null);
    }
}
