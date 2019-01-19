package finessefixturetests;

import fit.Fixture;
import pl.edu.pwr.io.lab.manager.ClientManager;

public class SetUp extends Fixture {
static ClientManager clientManager;
public SetUp(){
    clientManager = new ClientManager();
}
}
