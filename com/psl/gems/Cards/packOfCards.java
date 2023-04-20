package com.psl.gems.Cards;

import java.util.*;

public class packOfCards {

    private List<Card> pack;

    public packOfCards() {
        pack = new ArrayList<Card>();

        for (SUITS s : SUITS.values()) {
            for (CARDNUMBER cd : CARDNUMBER.values()) {
                pack.add(new Card(s, cd.getOrd()));
            }
        }
    }

    public List<Card> getCards() {
        return pack;
    }

    public void setCards(List<Card> cards) {
        this.pack = cards;
    }

    public void shuffleCards() {
        Collections.shuffle(pack);
    }

    public Card getTopCard(){
        
        pack.get(0).setServed(true);
        Card c=pack.get(0);
        pack.remove(0);
        return c;
    }

    public void showCards() {

        for (Card card : pack) {
            System.out.print(card+" ");
        }
        System.out.println();
    }

}
