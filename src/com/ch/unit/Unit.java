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
    public int getCurrentHP(){
        return getCurrentHP();
    }
    public void setCurrentHP(int currentHP){
        this.currentHP = currentHP;
    }

    public int getATK(){
        return ATK;
    }
    public void setATK(int ATK){
        this.ATK = ATK;
    }
    public void setDEF(int DEF){
        this.DEF = DEF;
    }

}
