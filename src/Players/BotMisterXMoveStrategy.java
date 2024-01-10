package Players;

public class BotMisterXMoveStrategy implements MoveInterface {
    private Move move;
    @Override
    public void getMove() {
        move.getMove();
    }

    @Override
    public void rollbackMove() {
        move.rollbackMove();
    }
}
