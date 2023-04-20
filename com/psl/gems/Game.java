package com.psl.gems;

import java.util.*;
import com.psl.gems.Cards.*;

public class Game {

    private List<Player> players;
    private packOfCards pack;

    public Game(){
        pack=new packOfCards();
        players=new ArrayList<Player>();
    }

    public Game(List<Player> players) {
        this.players = players;
        pack=new packOfCards();
        
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public packOfCards getPack() {
        return pack;
    }

    public void setPack(packOfCards pack) {
        this.pack = pack;
    }

    public void gameRegister(Player player) {
        players.add(player);
    }

    public void play() {

        System.out.println("Shuffling the cards...");
        pack.shuffleCards();
        System.out.println("Each player will get 3 card...... ");
        for(int i = 0; i < 3; i++){

        System.out.println("Cards given "+(i+1)+" times....");
            for(Player p : players){
                p.addCard(pack.getTopCard());
            }
        }
        
        for(Player p : players){
            System.out.println(p);
        }
        System.out.println("The winner is........");
        System.out.println("Player: "+ determinWinner() );

    }

    public Player determinWinner(){
       for(Player p : players){
            p.setScore(calculateScore(p.getPlayerCard()));
       }
       
       return players.stream()
            .max(Comparator.comparing(Player::getScore))
            .orElse(null);
    }

    public int calculateScore(List<Card>cards){
        int score=0;
        for(Card card : cards){
            int s=card.getRank()*4+card.getSuit().getOdr();
            if(s>score)
                score=s;
        }
        return score;
    }
    
}
