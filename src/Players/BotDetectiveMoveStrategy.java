package Players;

public class BotDetectiveMoveStrategy implements MoveInterface {

    private Move move;

    public BotDetectiveMoveStrategy(PlayerInterface player) {
        this.move = new Move(player);
    }

    @Override
    public void getMove() {
        System.out.println("Стратегия бота детектива");

    }

    @Override
    public void rollbackMove() {
        System.out.println("Стратегия бота детектива откачена");
    }
}
