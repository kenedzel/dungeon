package com.java.oop;

/**
 * Created by kenneth on 3/10/17.
 */
public class Player {

    private String name;

    private int currentCoordinateX;

    private int currentCoordinateY;

    public Player(String name, int currentCoordinateX, int currentCoordinateY) {
        this.name = name;
        this.currentCoordinateX = currentCoordinateX;
        this.currentCoordinateY = currentCoordinateY;
    }

    public int getCurrentCoordinateX() {
        return currentCoordinateX;
    }

    public void setCurrentCoordinateX(int currentCoordinateX) {
        this.currentCoordinateX = currentCoordinateX;
    }

    public int getCurrentCoordinateY() {
        return currentCoordinateY;
    }

    public void setCurrentCoordinateY(int currentCoordinateY) {
        this.currentCoordinateY = currentCoordinateY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveUp(int maxCoordinateY)
    {
        if(currentCoordinateY != maxCoordinateY)
        {
            currentCoordinateY++;
        }
        else
        {
            System.out.println("you bumped into a wall.");
        }

    }

    public void moveDown(int maxCoordinateY)
    {
        if (currentCoordinateY != 0)
        {
            currentCoordinateY--;
        }
        else
        {
            System.out.println("you bumped into a wall.");
        }
    }

    public void moveLeft(int maxCoordinateX)
    {
        if (currentCoordinateX != 0) //and not greater than max coordinate
        {
            currentCoordinateX++;
        }
        else
        {
            System.out.println("you bumped into a wall.");
        }
    }

    public void moveRight(int maxCoordinateX)
    {
        if( currentCoordinateX != maxCoordinateX && currentCoordinateX !=0)
        {
            currentCoordinateX--;
        }
        else
        {
            System.out.println("you bumped into a wall.");
        }
    }

    public boolean isTrapped(int trapCoordinateX, int trapCoordinateY)
    {
        if (getCurrentCoordinateX() == trapCoordinateX &&
                getCurrentCoordinateY() == trapCoordinateY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isFinished(int trapCoordinateX, int trapCoordinateY)
    {
        if(getCurrentCoordinateX() == trapCoordinateX &&
                getCurrentCoordinateY() == trapCoordinateY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
