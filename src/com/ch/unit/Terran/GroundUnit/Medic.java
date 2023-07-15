package com.ch.unit.Terran.GroundUnit;

import com.ch.unit.Terran.Building.Building;
import com.ch.unit.Unit;
import com.ch.unit.unitInterface.Healable;

public class Medic extends GroundUnit implements Healable {
    public Medic () {
        super(60, 0, 0, true);
        currentHP = MAX_HP;
    }
    public void Attack(){

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
        return "Medic";
    }

    public void heal(Healable h){
        Unit u = (Unit)h;
        if(h instanceof GroundUnit){

            while(u.currentHP!=u.MAX_HP){
                u.currentHP++;
            }
            System.out.println(u.toString() + " 의 치료 완료");
        }else if (h instanceof Building){
            while(u.currentHP != u.MAX_HP){
                u.currentHP++;
                System.out.println("치료중...");
            }
        }else{
            System.out.println("치료할 수 없는 유닛입니다.");
        }

    }

}