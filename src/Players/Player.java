package Players;

import field.Node;

public class Player extends BasePlayer {

    public Player(Node currentField, int taxiTicketCounter, int busTicketCounter, int boatTicketCounter, int undergroundTicketCounter, MoveInterface move) {
        super(currentField, taxiTicketCounter, busTicketCounter, boatTicketCounter, undergroundTicketCounter, move);
    }
}
