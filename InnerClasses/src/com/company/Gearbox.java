package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gears> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gears neutral = new Gears(0, 0.0);
        this.gears.add(neutral);

    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if ((number > 0) && number <= maxGears) {
            this.gears.add(new Gears(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear > 0) && (newGear < this.gears.size() && this.clutchIsIn)) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " gear selected");
        } else {
            System.out.println("GRRRRRRR!!!!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!!");
        }
        return revs * gears.get(currentGear).getGearRatio();
    }

    private class Gears {
        private int gearNumber;
        private double gearRatio;


        public Gears(int gearNumber, double gearRatio) {


            this.gearNumber = gearNumber;
            this.gearRatio = gearRatio;
        }

        public double getGearRatio() {
            return gearRatio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.gearRatio);
        }
    }
}