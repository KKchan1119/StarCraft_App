package com.ch.unit.Terran.Building;

import com.ch.unit.Unit;
import com.ch.unit.unitInterface.Liftable;

public class LiftableImpl implements Liftable {

  @Override
  public void liftOff(Building b) {
    b.isGround = false;
  }

  @Override
  public void land(Building b) {
    b.isGround = true;
  }
}
