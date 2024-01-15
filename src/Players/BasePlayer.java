package Players;

import field.Node;

public class BasePlayer implements PlayerInterface {

    protected Node currentField;
    protected int taxiTicketCounter;
    protected int busTicketCounter;
    protected int boatTicketCounter;
    protected int undergroundTicketCounter;
    protected MoveInterface move;
    protected Roles role;

    public Node getCurrentField() {
        return currentField;
    }

    public void setCurrentField(Node currentField) {
        this.currentField = currentField;
    }

    public int getTaxiTicketCounter() {
        return taxiTicketCounter;
    }

    public void setTaxiTicketCounter(int taxiTicketCounter) {
        this.taxiTicketCounter = taxiTicketCounter;
    }

    public int getBusTicketCounter() {
        return busTicketCounter;
    }

    public void setBusTicketCounter(int busTicketCounter) {
        this.busTicketCounter = busTicketCounter;
    }

    public int getBoatTicketCounter() {
        return boatTicketCounter;
    }

    public void setBoatTicketCounter(int boatTicketCounter) {
        this.boatTicketCounter = boatTicketCounter;
    }

    public int getUndergroundTicketCounter() {
        return undergroundTicketCounter;
    }

    public void setUndergroundTicketCounter(int undergroundTicketCounter) {
        this.undergroundTicketCounter = undergroundTicketCounter;
    }

    @Override
    public MoveInterface getMove() {
        return move;
    }


    public void setMove(Move move) {
        this.move = move;
    }

    public BasePlayer(Node currentField, int taxiTicketCounter, int busTicketCounter, int boatTicketCounter, int undergroundTicketCounter, Roles role) {
        this.currentField = currentField;
        this.taxiTicketCounter = taxiTicketCounter;
        this.busTicketCounter = busTicketCounter;
        this.boatTicketCounter = boatTicketCounter;
        this.undergroundTicketCounter = undergroundTicketCounter;
        this.role = role;
    }
}
