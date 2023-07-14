package com.ch.unit.Terran.Building;

import com.ch.unit.unitInterface.Liftable;
import com.ch.unit.unitInterface.Repairable;
import com.ch.unit.Unit;

public class Barracks extends Building implements Liftable, Repairable {

  public Barracks() {
    super(1000, 0, 1, true);
    currentHP = MAX_HP;
  }

  public int getCurrentHP() { return getCurrentHP(); }
  public void setCurrentHp(int currentHP) { this.currentHP = currentHP; }

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
  public String toString() { return "Barracks"; }

  LiftableImpl l = new LiftableImpl();

  @Override
  public void liftOff() {
    l.liftOff();
  }

  @Override
  public void land() {
    l.land();
  }
}
