package Players;

public class PlayerMisterXMoveStrategy implements MoveInterface {

private Move move;

    public PlayerMisterXMoveStrategy(PlayerInterface player) {
        this.move = new Move(player);
    }

    @Override
    public void getMove() {

    }

    @Override
    public void rollbackMove() {

    }
}
