package com.ch.unit.Terran.Mechine.AirUnit;

import com.ch.unit.Unit;
import com.ch.unit.unitInterface.Repairable;

public class Dropship extends AirUnit implements Repairable {
    public Dropship() {
        super(150, 0, 1);
        currentHP = MAX_HP;
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

    @Override
    public String toString(){
        return "Dropship";
    }

}
