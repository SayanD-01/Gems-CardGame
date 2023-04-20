package com.psl.gems.Cards;

public enum SUITS {

    CLUB(0), DIAMOND(1), HEARTS(2), SPADE(3);

    private final int odr;
    SUITS(int i){
        this.odr = i;
    }
    public int getOdr(){
        return odr;
    }

}
