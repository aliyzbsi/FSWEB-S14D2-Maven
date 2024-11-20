package org.example;

import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 75);
        Wardrobe wardrobe = new Wardrobe(100, 200, 75.5);
        Carpet carpet = new Carpet(50, 100, PaintColor.RED);

        Bedroom bedroom = new Bedroom("My Room", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        System.out.println("Bedroom Name: " + bedroom.getName());
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getCarpet().lying();
        bedroom.getWardrobe().add();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
    }
}
