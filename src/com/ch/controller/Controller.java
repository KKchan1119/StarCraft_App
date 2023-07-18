package com.ch.controller;

import com.ch.unit.Terran.GroundUnit.Marine;
import com.ch.unit.Unit;

import java.util.Scanner;
public class Controller {
    Scanner in = new Scanner(System.in);
    Unit unitArr[] = new Unit[200];

    public Unit Spawn (){
        String SpawnUnitName = in.nextLine();
        int SpawnNum = Integer.parseInt(in.nextLine());
        switch (SpawnUnitName) {
            case "Marine":
                unitArr[SpawnNum] = new Marine();
                System.out.println(unitArr[SpawnNum].toString() + "의 정보 표시\n"
                        + "체력:" + unitArr[SpawnNum].currentHP + "/" + unitArr[SpawnNum].MAX_HP + "\n"
                        + "공격력:" + unitArr[SpawnNum].ATK + "\n"
                        + "방어력:" + unitArr[SpawnNum].DEF + "\n");
        }
        return unitArr[SpawnNum];
    }
    public void AttackCMD(int Me, int Tg){
        Unit unitArr[] = new Unit[200];
        unitArr[Me].Attack(unitArr[Tg]);
    }
}
