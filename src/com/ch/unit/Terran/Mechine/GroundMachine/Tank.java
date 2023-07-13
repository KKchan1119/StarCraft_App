package com.ch.unit.Terran.Mechine.GroundMachine;
import com.ch.unit.unitInterface.Repairable;
import com.ch.unit.Terran.Mechine.Mechine;


public class Tank extends Mechine implements Repairable{
    public Tank() {
        super(150, 30, 1);
        currentHP = MAX_HP;
    }

    @Override
    public String toString() {
        return "Tank";
    }
}
