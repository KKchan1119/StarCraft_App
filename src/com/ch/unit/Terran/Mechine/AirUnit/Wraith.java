package com.ch.unit.Terran.Mechine.AirUnit;
import com.ch.unit.unitInterface.Repairable;
import com.ch.unit.Terran.Mechine.Mechine;

public class Wraith extends Mechine implements Repairable{
    public Wraith(){
        super(120,8,0);
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
        return "Wraith";
    }
}
