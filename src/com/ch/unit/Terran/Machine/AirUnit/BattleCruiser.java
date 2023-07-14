package com.ch.unit.Terran.Machine.AirUnit;
import com.ch.unit.unitInterface.Repairable;
import com.ch.unit.Terran.Machine.Machine;

public class BattleCruiser extends Machine implements Repairable{
  public BattleCruiser(){
    super(500,25,3, false);
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
    return "BattleCruiser";
  }
}

