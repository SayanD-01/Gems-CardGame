package com.psl.gems;

import java.util.*;

//import com.psl.gems.Cards.packOfCards;

public class Main {
    
    public static void main(String[] args) {
        
        Game game =new Game();
        game.gameRegister(new Player("Ramesh"));
        game.gameRegister(new Player("Suresh"));
        game.play();
        FileWrite.writeHTMLOutput(game.getPlayers() );
        
    }
}
