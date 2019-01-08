import org.junit.Test;
import pl.edu.pwr.io.lab.manager.ClientManager;
import pl.edu.pwr.io.lab.common.Client;

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
        Client updatedClient = clientManager.updateClient(clientID, "Ignacy", "Krasicki", "321");

        // then
        assertNotNull(updatedClient);
        assertEquals("Ignacy", updatedClient.getName());
        assertEquals("Krasicki", updatedClient.getSurname());
        assertEquals("321", updatedClient.getPersonalIDCardSerial());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testClientUpdateNegativeID(){

        // given
        String clientID = "-1";

        // when
        Client updatedClient = clientManager.updateClient(clientID, "Ignacy", "Krasicki", "321");
    }

    @Test
    public void testClientUpdateNonExistentID(){

        // given
        String clientID = "112412";

        // when
        Client updatedClient = clientManager.updateClient(clientID,"Ignacy", "Krasicki", "321");

        // then
        assertNull(updatedClient);
    }
}