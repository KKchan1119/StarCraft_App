package com.ch.unit.Terran.Mechine.AirUnit;
import com.ch.unit.unitInterface.Repairable;
import com.ch.unit.Terran.Mechine.Mechine;

public class Wraith extends Mechine implements Repairable{
    public Wraith(){
        super(120,8,0);
    }
    @Override
    public String toString(){
        return "Wraith";
    }
}
