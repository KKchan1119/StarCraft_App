package com.ch.unit.Terran.GroundUnit;
import com.ch.unit.Terran.Building.Building;
import com.ch.unit.unitInterface.Repairable;
import com.ch.unit.Terran.Mechine.*;
import com.ch.unit.Unit;
public class SCV extends GroundUnit implements Repairable {
    public SCV() {
        super(60, 5, 0);
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
        return "SCV";
    }
    public void repair(Repairable r){
        Unit u = (Unit)r;
        if(r instanceof Mechine){

            while(u.currentHP!=u.MAX_HP){
                u.currentHP++;
            }
            System.out.println(u.toString() + " 의 수리 완료");
        }else if (r instanceof Building){
            while(u.currentHP != u.MAX_HP){
                u.currentHP++;
            }
        }else{
            System.out.println("수리할 수 없는 유닛입니다.");
        }
    }
}
