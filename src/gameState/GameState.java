package gameState;


import Players.Bot;
import Players.MoveInterface;
import Players.Player;
import Players.PlayerInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GameState {

    private final Stack<MoveInterface> stackPreviosSteps = new Stack<>();
    private final Stack<MoveInterface> stackFutureSteps = new Stack<>();
    private final List<PlayerInterface> players = new ArrayList<>();

    private int currentPlayerIndex = 0;

    public GameState() {
        players.add(new Player());
        players.add(new Bot());
    }

    public void nextStep(){
        MoveInterface move = players.get(currentPlayerIndex).getMove();
        currentPlayerIndex += 1;
        if(currentPlayerIndex == players.size()){
            currentPlayerIndex =0;
        }
        stackPreviosSteps.add(move);
    }
}
