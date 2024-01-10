package Players;

import field.Node;

public interface PlayerInterface {


    public Node getCurrentField();
    public void setCurrentField(Node currentField);
    public int getTaxiTicketCounter();
    public void setTaxiTicketCounter(int taxiTicketCounter);
    public int getBusTicketCounter();
    public void setBusTicketCounter(int busTicketCounter);
    public int getBoatTicketCounter();
    public void setBoatTicketCounter(int boatTicketCounter);
    public int getUndergroundTicketCounter();

    public void setUndergroundTicketCounter(int undergroundTicketCounter);

    public MoveInterface getMove();

    public void setMove(Move move);
}
