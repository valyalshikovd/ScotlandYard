package Players;

public class PlayerDetectiveMoveStrategy implements MoveInterface{
    private Move move;

    public PlayerDetectiveMoveStrategy(PlayerInterface player) {
        this.move = new Move(player);
    }

    @Override
    public void getMove() {

    }

    @Override
    public void rollbackMove() {

    }
}
