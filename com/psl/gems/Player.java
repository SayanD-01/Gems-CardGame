package com.psl.gems;

import java.util.*;
import com.psl.gems.Cards.Card;

public class Player {
    
    String name;
    List<Card>playerCard;
    int score;
    
    public Player(String name) {
        this.name = name;
        playerCard=new ArrayList<Card>();
        this.score=0;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public List<Card> getPlayerCard() {
        return playerCard;
    }

    public void setPlayerCard(List<Card> playerCard) {
        this.playerCard = playerCard;
    }

    public void addCard(Card card) {
        playerCard.add(card);
    }

    public String revealCards(){
        String str=new String();
        str=" [ ";
        for(Card card : playerCard){
            str+=card+" ";
        }
        str+=" ] ";
        return str;
    }

    @Override
    public String toString() {
        return "Player Name=" + name +revealCards() +", Score=" + score + "]\n";
    }
    

}
