package Players;

import field.Node;

public class Player implements PlayerInterface{

    private BasePlayer player;


    @Override
    public MoveInterface move() {

    }

    @Override
    public Node getCurrentField() {
        return player.getCurrentField();
    }

    @Override
    public void setCurrentField(Node currentField) {
player.setCurrentField(currentField);
    }

    @Override
    public int getTaxiTicketCounter() {
        return player.getTaxiTicketCounter();
    }

    @Override
    public void setTaxiTicketCounter(int taxiTicketCounter) {
return;
    }

    @Override
    public int getBusTicketCounter() {
        return 0;
    }

    @Override
    public void setBusTicketCounter(int busTicketCounter) {

    }

    @Override
    public int getBoatTicketCounter() {
        return 0;
    }

    @Override
    public void setBoatTicketCounter(int boatTicketCounter) {

    }

    @Override
    public int getUndergroundTicketCounter() {
        return 0;
    }

    @Override
    public void setUndergroundTicketCounter(int undergroundTicketCounter) {

    }

    @Override
    public Move getMove() {
        return null;
    }

    @Override
    public void setMove(Move move) {

    }
}
