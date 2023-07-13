package com.ch.unit.Terran.GroundUnit;

public class Marine extends GroundUnit {
    public Marine() {
        super(40, 6, 0);
        currentHP = MAX_HP;
    }

    @Override
    public String toString() {
        return "Marine";
    }
}
