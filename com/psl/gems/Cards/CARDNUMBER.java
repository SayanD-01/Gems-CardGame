package com.psl.gems.Cards;

public enum CARDNUMBER {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
     
    private int ord;

     private CARDNUMBER(int i)
     {
        this.ord = i;
     }
     
     public int getOrd(){
        return ord;
     }
}
