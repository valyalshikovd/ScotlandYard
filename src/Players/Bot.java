package Players;

import field.Node;

public class Bot extends BasePlayer {


    public Bot(Node currentField, int taxiTicketCounter, int busTicketCounter, int boatTicketCounter, int undergroundTicketCounter, Roles role) {
        super(currentField, taxiTicketCounter, busTicketCounter, boatTicketCounter, undergroundTicketCounter, role);
    }

    @Override
    public MoveInterface getMove(){
        if(role == Roles.Detective){
            return new BotDetectiveMoveStrategy(this);
        }
        if(role == Roles.MisterX){
            return new BotMisterXMoveStrategy(this);
        }
        return null;
    }
}
