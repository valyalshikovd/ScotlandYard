import gameState.GameState;

public class Main {
    public static void main(String[] args) {

        GameState gs = new GameState();
        while (true){
            gs.nextStep();
        }
    }
}