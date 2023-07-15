package test;

import com.ch.unit.Terran.Building.Barracks;
import com.ch.unit.Terran.Building.Building;
import com.ch.unit.Terran.GroundUnit.*;
import com.ch.unit.Terran.Machine.GroundMachine.*;
import com.ch.unit.Unit;

import java.util.Scanner;
public class StarCraftAppTest {

    public static void main(String[] args) {

        Unit unitArr[] = new Unit[200];
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        in.nextLine();

        unitArr[i] = new Marine();

        System.out.println(unitArr[i].toString() + "의 정보 표시\n"
            + "체력:" + unitArr[i].currentHP + "/" + unitArr[i].MAX_HP + "\n"
            + "공격력:" + unitArr[i].ATK + "\n"
            + "방어력:" + unitArr[i].DEF + "\n");

        int j = in.nextInt();
        unitArr[j] = new Tank();
        System.out.println(unitArr[j].toString() + "의 정보 표시\n"
            + "체력:" + unitArr[j].currentHP + "/" + unitArr[j].MAX_HP + "\n"
            + "공격력:" + unitArr[j].ATK + "\n"
            + "방어력:" + unitArr[j].DEF + "\n");

        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(unitArr[x].toString() + "가" + unitArr[y].toString() + "을 공격합니다.");
        unitArr[y].currentHP = unitArr[y].currentHP - (unitArr[x].ATK - unitArr[y].DEF);
        System.out.println(unitArr[y].toString() + "의 정보 표시\n"
            + "체력:" + unitArr[y].currentHP + "/" + unitArr[y].MAX_HP + "\n"
            + "공격력:" + unitArr[y].ATK + "\n"
            + "방어력:" + unitArr[y].DEF + "\n");
        if (unitArr[y].currentHP <= 0) {
            unitArr[y] = null;
            System.out.println(unitArr[y] + "가 제거되었습니다.");
        }

        int a = in.nextInt();
        System.out.println("수리 시작");
        SCV scv = new SCV();
        scv.repair(unitArr[a]);
        System.out.println(unitArr[y].toString() + "의 정보 표시\n"
            + "체력:" + unitArr[y].currentHP + "/" + unitArr[y].MAX_HP + "\n"
            + "공격력:" + unitArr[y].ATK + "\n"
            + "방어력:" + unitArr[y].DEF + "\n");
        
        int d = in.nextInt();
        unitArr[d] = new Barracks();

        unitArr[d].liftOff((Building) unitArr[d]);
        System.out.println(d + "배럭 동락 " +unitArr[d].isGround);

        unitArr[d].land((Building) unitArr[d]);
        System.out.println( d + "배럭 동락 " +unitArr[d].isGround);

        int c = in.nextInt();
        unitArr[c] = new Barracks();

        unitArr[c].liftOff((Building) unitArr[c]);
        System.out.println(c + "배럭 동작 " + unitArr[c].isGround);


    }
}