package com.java.oop;

import java.util.Random;

/**
 * Created by kenneth on 3/10/17.
 */
public abstract class Dungeon {

    private int maxCoordinateX;

    private int maxCoordinateY;

    private int trapCoordinateX;

    private int trapCoordinateY;

    private int endPortalCoordinateX;

    private int endPortalCoordinateY;

    private String name;

    public Dungeon() {
    }

    public Dungeon(int maxCoordinateX, int maxCoordinateY,
                   String name) {
        this.maxCoordinateX = maxCoordinateX;
        this.maxCoordinateY = maxCoordinateY;
        this.name = name;
        System.out.println("Welcome to " + name);//
    }

    public int getEndPortalCoordinateX() {
        return endPortalCoordinateX;
    }

    public void setEndPortalCoordinateX(int endPortalCoordinateX) {
        this.endPortalCoordinateX = endPortalCoordinateX;
    }

    public int getEndPortalCoordinateY() {
        return endPortalCoordinateY;
    }

    public void setEndPortalCoordinateY(int endPortalCoordinateY) {
        this.endPortalCoordinateY = endPortalCoordinateY;
    }

    public int getTrapCoordinateX() {
        return trapCoordinateX;
    }

    public void setTrapCoordinateX(int trapCoordinateX) {
        this.trapCoordinateX = trapCoordinateX;
    }

    public int getTrapCoordinateY() {
        return trapCoordinateY;
    }

    public void setTrapCoordinateY(int trapCoordinateY) {
        this.trapCoordinateY = trapCoordinateY;
    }

    public int getMaxCoordinateX() {
        return maxCoordinateX;
    }

    public void setMaxCoordinateX(int maxCoordinateX) {
        this.maxCoordinateX = maxCoordinateX;
    }

    public int getMaxCoordinateY() {
        return maxCoordinateY;
    }

    public void setMaxCoordinateY(int maxCoordinateY) {
        this.maxCoordinateY = maxCoordinateY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int generateRandomDamage()
    {
        Random random = new Random();
        int randomDamage = random.nextInt(10) + 1;
        return randomDamage;
    }



    public void printEndMessage()
    {
        System.out.println("Congratulations! You've entered into the portal.\nEntering another dungeon. . .");
    }

    public abstract void printMap(int currentCoordinateX, int currentCoordinateY);

    public abstract void printTrapMessage();

    public abstract void setEndPortalCoordinates();

    public abstract void setTraps();
}
