package com.ch.unit.Terran.Building;

import com.ch.unit.unitInterface.Liftable;
import com.ch.unit.unitInterface.Repairable;

public class CommandCenter extends Building implements Liftable, Repairable {

  public CommandCenter() {
    super(1500, 0, 1, true);
    currentHP = MAX_HP;
  }

  public int getCurrentHP() {
    return getCurrentHP();
  }

  public void setCurrentHp(int currentHP) {
    this.currentHP = currentHP;
  }

  public int getATK() {
    return ATK;
  }

  public void setATK(int ATK) {
    this.ATK = ATK;
  }

  public void setDEF(int DEF) {
    this.DEF = DEF;
  }

  @Override
  public String toString() {
    return "CommandCenter";
  }

  LiftableImpl l = new LiftableImpl();

  @Override
  public void liftOff(Building b) {
    l.liftOff(this);
  }

  @Override
  public void land(Building b) {
    l.land(this);
  }
}
