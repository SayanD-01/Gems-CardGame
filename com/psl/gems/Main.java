package com.psl.gems;

import java.util.*;

//import com.psl.gems.Cards.packOfCards;

public class Main {
    
    public static void main(String[] args) {
        
        // packOfCards pack=new packOfCards();
        // System.out.println("Displaying cards.....");
        // pack.showCards();
        // pack.shuffleCards();
        // System.out.println("Displaying cards after shuffle 1.....");
        // pack.showCards();
        List<Player>players =new ArrayList<Player>();
        players.add(new Player("Ramesh"));
        players.add(new Player("Suresh"));
        Game game =new Game(players);
        game.play();
        FileWrite.writeHTMLOutput(players);
    }
}
