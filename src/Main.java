import field.Field;
import gameState.GameState;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        field.createField("graph.txt");

        GameState gs = new GameState();
        while (true){
            gs.nextStep();
        }
    }
}