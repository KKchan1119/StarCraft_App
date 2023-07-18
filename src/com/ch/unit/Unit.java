package com.ch.unit;

import com.ch.unit.Terran.Building.Building;
import com.ch.unit.unitInterface.Liftable;
import com.ch.unit.unitInterface.Repairable;

public class Unit implements Repairable ,Liftable {

    public boolean isGround;
    public int currentHP;
    public final int MAX_HP;
    public int ATK;
    public int DEF;
    public Object Attack;

    // public boolean isGround;
    public Unit(int hp,int ATK, int DEF, boolean isGround){
        MAX_HP = hp;
        this.ATK = ATK;
        this.DEF = DEF;
        this.isGround = isGround;
    }
    public void Attack(Unit Tg){
        this.ATK = ATK;
        Tg.currentHP = Tg.currentHP - ATK;
        System.out.println(Tg.toString()+"의 체력: " + Tg.currentHP);
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

    public boolean getisGround() {
        return getisGround();
    }

    @Override
    public void liftOff(Building b) {

    }

    @Override
    public void land(Building b) {

    }
}
