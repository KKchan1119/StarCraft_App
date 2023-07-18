package test;

import com.ch.controller.Controller;
import com.ch.unit.Terran.GroundUnit.Marine;
import com.ch.unit.Unit;

import java.util.Scanner;

public class StarCraftAppTest_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Controller ctrl = new Controller();
        while(true){
            switch (in.nextLine()){
                case "spawn":
                    ctrl.Spawn();
                    break;
                case "attack":
                    ctrl.AttackCMD();
                    break;
                case "scan":
                    ctrl.Scan();
                    break;
                default:
                    System.out.println("프로그램 종료");
                    System.exit(0);
            }
        }


    }
}
