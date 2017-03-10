package com.java.oop;

/**
 * Created by kenneth on 3/10/17.
 */
public class AlienDungeon extends Dungeon {

    public AlienDungeon(int maxCoordinateX, int maxCoordinateY,
                        String name) {
        super(maxCoordinateX, maxCoordinateY, name);
    }

    @Override
    public void setTraps() {
        setTrapCoordinateX(5);
        setTrapCoordinateY(4);
    }

    @Override
    public void setEndPortalCoordinates() {
        setEndPortalCoordinateX(2);
        setEndPortalCoordinateY(2);
    }

    @Override
    public void printTrapMessage() {
        System.out.println("You've been abducted by an alien. ayyy lmao");
    }
}
