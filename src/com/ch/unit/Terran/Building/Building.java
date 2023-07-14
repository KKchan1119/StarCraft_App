package com.ch.unit.Terran.Building;

import com.ch.unit.Unit;
import com.ch.unit.unitInterface.Liftable;

public class Building extends Unit implements Liftable {
    Building(int hp, int atk, int def, boolean isGround){
        super(hp, atk, def, isGround);

    }

    @Override
    public void liftOff() {

    }

    @Override
    public void land() {

    }
}
