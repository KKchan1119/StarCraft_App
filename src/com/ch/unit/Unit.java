package com.ch.unit;

public class Unit {
    public int currentHP;
    public final int MAX_HP;
    public int ATK;
    public int DEF;
    public Unit(int hp,int ATK, int DEF){
        MAX_HP = hp;
        this.ATK = ATK;
        this.DEF = DEF;
    }

}
