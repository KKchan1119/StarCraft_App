package com.ch.unit.Terran.Machine.GroundMachine;

import com.ch.unit.unitInterface.Repairable;
import com.ch.unit.Terran.Machine.Machine;


public class Goliath extends Machine implements Repairable{
  public Goliath() {
    super(125, 12, 1, true);
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
    return "Goliath";
  }
}
