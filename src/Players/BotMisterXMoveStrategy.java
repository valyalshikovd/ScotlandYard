package Players;

public class BotMisterXMoveStrategy implements MoveInterface {
    private Move move;

    public BotMisterXMoveStrategy(PlayerInterface player) {
        this.move = new Move(player);
    }

    @Override
    public void getMove() {
        move.getMove();
        System.out.println("Стратегия бота МистераХ");
    }

    @Override
    public void rollbackMove() {

        move.rollbackMove();
        System.out.println("Стратегия бота МистераХ откачена");
    }
}
