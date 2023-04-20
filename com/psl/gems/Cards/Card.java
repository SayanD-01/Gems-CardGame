package com.psl.gems.Cards;

public class Card {
    private SUITS suit;
    private int rank;
    private boolean isServed;

    public Card(){}

    public Card(SUITS suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        this.isServed = false;
    }


    public SUITS getSuit() {
        return suit;
    }


    public void setSuit(SUITS suit) {
        this.suit = suit;
    }


    public int getRank() {
        return rank;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }


    public boolean isServed() {
        return isServed;
    }


    public void setServed(boolean isServed) {
        this.isServed = isServed;
    }


    @Override
    public String toString() {
        return suit.toString()+"-"+CARDNUMBER.values()[rank-2].toString();
    }
    
    
}
