import org.junit.Test;
import pl.edu.pwr.io.lab.manager.ReservationManager;

import java.util.NoSuchElementException;
import static org.junit.Assert.*;

/**
 * Created by Marcin on 08.01.2019
 */
public class ReservationManagerTest {

    private ReservationManager reservationManager = new ReservationManager();

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIncorrectReservationID(){

        // given
        String reservationID = "-1";

        // when
        reservationManager.deleteReservation(reservationID);
    }

    @Test(expected = NoSuchElementException.class)
    public void testDeleteReservationNonExistent(){

        // given
        String reservationID = "125";

        // when
        reservationManager.deleteReservation(reservationID);
    }

    @Test
    public void testDeleteCorrectReservation(){

        // given
        String reservationID = "1251532";

        // when
        boolean successDeleteReservation = reservationManager.deleteReservation(reservationID);

        // then
        assertTrue(successDeleteReservation);
    }
}
