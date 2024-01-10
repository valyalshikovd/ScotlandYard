package Players;

public class Move implements MoveInterface{

    private PlayerInterface player;

    public Move(PlayerInterface player) {
        this.player = player;
    }

    @Override
    public void getMove() {

    }

    @Override
    public void rollbackMove() {

    }
}
