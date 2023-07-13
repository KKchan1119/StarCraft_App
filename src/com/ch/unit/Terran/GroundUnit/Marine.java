package com.ch.unit.Terran.GroundUnit;

public class Marine extends GroundUnit {
    public Marine() {
        super(40, 6, 0);
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
        return "Marine";
    }
}
