package Players;

import field.Node;

public class Player extends BasePlayer {

    public Player(Node currentField, int taxiTicketCounter, int busTicketCounter, int boatTicketCounter, int undergroundTicketCounter, Roles role) {
        super(currentField, taxiTicketCounter, busTicketCounter, boatTicketCounter, undergroundTicketCounter, role);
    }
}
