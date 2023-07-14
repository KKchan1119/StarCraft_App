package com.ch.unit;

import com.ch.unit.unitInterface.Repairable;

public class Unit implements Repairable {

    public boolean isGround;
    public int currentHP;
    public final int MAX_HP;
    public int ATK;
    public int DEF;
    // public boolean isGround;
    public Unit(int hp,int ATK, int DEF, boolean isGround){
        MAX_HP = hp;
        this.ATK = ATK;
        this.DEF = DEF;
        this.isGround = isGround;
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
