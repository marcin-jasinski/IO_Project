package fitnesstests;

import fit.Fixture;
import pl.edu.pwr.io.lab.manager.ClientManager;

/**
 * Created by Marcin on 15.01.2019
 */
public class SetUp extends Fixture {

    static ClientManager clientManager;

    public SetUp(){
        clientManager = new ClientManager();
    }
}
