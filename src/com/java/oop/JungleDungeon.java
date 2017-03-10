package com.java.oop;

/**
 * Created by kenneth on 3/10/17.
 */
public class JungleDungeon extends Dungeon {

    public JungleDungeon(int maxCoordinateX, int maxCoordinateY, String name) {
        super(maxCoordinateX, maxCoordinateY, name);
    }

    @Override
    public void setTraps() {
        setTrapCoordinateX(2);
        setTrapCoordinateY(4);
    }

    @Override
    public void setEndPortalCoordinates() {
        setEndPortalCoordinateX(5);
        setEndPortalCoordinateY(3);
    }

    @Override
    public void printTrapMessage() {
        System.out.println("You've been mauled to death by harambe.");
    }
}
