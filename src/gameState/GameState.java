package gameState;


import Players.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class GameState {

    private final Stack<MoveInterface> stackPreviousSteps = new Stack<>();
    private final Stack<MoveInterface> stackFutureSteps = new Stack<>();
    private final List<PlayerInterface> players = new ArrayList<>();


    private int currentPlayerIndex = 0;

    public GameState() {
        players.add(new Bot(null, 0,0,0,0, Roles.MisterX));
        players.add(new Bot(null, 0,0,0,0, Roles.Detective));
    }

    public void nextStep(){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Введите N для продолжения ");
        MoveInterface move = players.get(currentPlayerIndex).getMove();
        currentPlayerIndex += 1;
        if(currentPlayerIndex == players.size()){
            currentPlayerIndex =0;
        }
        System.out.println(move);
        move.getMove();
        stackPreviousSteps.add(move);
    }
}
