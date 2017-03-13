package com.java.oop;

/**
 * Created by kenneth on 3/10/17.
 */
public class FilthyDungeon extends Dungeon {

    public FilthyDungeon(int maxCoordinateX, int maxCoordinateY,
                         String name) {
        super(maxCoordinateX, maxCoordinateY, name);
    }

    @Override
    public void printMap(int currentCoordinateX, int currentCoordinateY)
    {
        for (int y = getMaxCoordinateY() ; y > 0 ; y--)
        {
            for (int x = getMaxCoordinateX() ; x > 0 ; x--)
            {
                if (currentCoordinateX == x && currentCoordinateY == y)
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void setTraps() {
        //Dung Trap
        setTrapCoordinateX(3);
        setTrapCoordinateY(5);
    }

    @Override
    public void setEndPortalCoordinates() {
        setEndPortalCoordinateX(3);
        setEndPortalCoordinateY(4);
    }

    @Override
    public void printTrapMessage() {
        System.out.println("Oh no! You stepped on a poo.\nGame Over");
    }
}
