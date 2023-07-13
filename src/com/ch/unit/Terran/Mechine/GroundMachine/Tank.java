package com.ch.unit.Terran.Mechine.GroundMachine;
import com.ch.unit.unitInterface.Repairable;
import com.ch.unit.Terran.Mechine.Mechine;


public class Tank extends Mechine implements Repairable{
    public Tank() {
        super(150, 30, 1);
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
    public String toString() {
        return "Tank";
    }
}
