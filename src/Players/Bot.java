package Players;

import field.Node;

public class Bot extends BasePlayer {

    public Bot(Node currentField, int taxiTicketCounter, int busTicketCounter, int boatTicketCounter, int undergroundTicketCounter, MoveInterface move) {
        super(currentField, taxiTicketCounter, busTicketCounter, boatTicketCounter, undergroundTicketCounter, move);
    }

}
