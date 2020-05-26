package com.company;

public class Main {

    public static void main(String[] args) {

        Gearbox porsche = new Gearbox(6);
//        Gearbox.Gears first = porsche.new Gears(1,15.6); //syntax!!!! if Gears is public
//        System.out.println(first.driveSpeed(1000));
        porsche.addGear(1,2.5);
        porsche.addGear(2,5.2);
        porsche.addGear(3,7.8);
        porsche.operateClutch(true);
        porsche.changeGear(1);
        porsche.operateClutch(false);
        System.out.println(porsche.wheelSpeed(1000));
        porsche.changeGear(2);
        System.out.println(porsche.wheelSpeed(3000));
        porsche.operateClutch(true);
        porsche.changeGear(3);
        porsche.operateClutch(false);
        System.out.println(porsche.wheelSpeed(5000));
    }
}
