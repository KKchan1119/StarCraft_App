package com.ch.controller;

import com.ch.unit.Terran.GroundUnit.Marine;
import com.ch.unit.Unit;

import java.util.Arrays;
import java.util.Scanner;
public class Controller {
    Scanner in = new Scanner(System.in);
    Unit unitArr[] = new Unit[200];
    Unit unit;

    public Unit Spawn (){
        String SpawnUnitName = in.nextLine();

        switch (SpawnUnitName) {
            case "Marine":
                unitArr[unit.unitNumber] = new Marine();
                System.out.println(unitArr[unit.unitNumber].toString() + "의 정보 표시\n"
                        + "체력:" + unitArr[unit.unitNumber].currentHP + "/" + unitArr[unit.unitNumber].MAX_HP + "\n"
                        + "공격력:" + unitArr[unit.unitNumber].ATK + "\n"
                        + "방어력:" + unitArr[unit.unitNumber].DEF + "\n");
                unit.unitNumber++;
        }
        return unitArr[unit.unitNumber];
    }
    public void AttackCMD(){
        int thisNum = Integer.parseInt(in.nextLine());;
        int TgNum = Integer.parseInt(in.nextLine());;
        unitArr[thisNum].Attack(unitArr[TgNum]);

    }

    public void Scan(){
        System.out.println(Arrays.toString(unitArr));
    }
}
