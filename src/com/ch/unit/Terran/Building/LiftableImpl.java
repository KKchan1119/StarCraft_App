package com.ch.unit.Terran.Building;

import com.ch.unit.Unit;
import com.ch.unit.unitInterface.Liftable;

public class LiftableImpl implements Liftable {
  Unit u;
  public void liftOff() {
    u.isGround = false;
    //System.out.println(toString() + "이 이륙했습니다.");
  }

  public void land() {
    u.isGround = true;
    //System.out.println(toString() + "이 착륙했습니다.");
  }

}
