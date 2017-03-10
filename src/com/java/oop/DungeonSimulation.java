package com.java.oop;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.Console;
import java.util.Scanner;

/**
 * Created by kenneth on 3/10/17.
 */
public class DungeonSimulation {
    public static void main(String[] args) {
        int stage;
        Scanner scanner = new Scanner(System.in);
        String playerName;
        System.out.println("What is your name? ");
        playerName = scanner.nextLine();
        printDungeonSelection();
        stage = scanner.nextInt();
        scanner.nextLine();
        Player player = new Player(playerName, 0, 0);
        switch (stage)
        {
            case 1:
                String movement;
                Dungeon filthyDungeon = new FilthyDungeon(5, 5, "Filthy Dungeon");
                filthyDungeon.setTraps();
                filthyDungeon.setEndPortalCoordinates();
                do{
                    System.out.println("Commence a movement (W - up, A - left, S - down, D - right): ");
                    movement = scanner.nextLine();
                    if(movement.equals("W") || movement.equals("w"))
                    {
                        player.moveUp(filthyDungeon.getMaxCoordinateY());
                    }
                    else if (movement.equals("A") || movement.equals("a"))
                    {
                        player.moveLeft(filthyDungeon.getMaxCoordinateX());
                    }
                    else if (movement.equals("S") || movement.equals("s"))
                    {
                        player.moveDown(filthyDungeon.getMaxCoordinateY());
                    }
                    else if (movement.equals("D") || movement.equals("d"))
                    {
                        player.moveRight(filthyDungeon.getMaxCoordinateX());
                    }
                    else
                    {
                        System.out.println("Invalid movement, please try again");
                    }
                    System.out.println("("+ player.getCurrentCoordinateX() + " , " + player.getCurrentCoordinateY() + ")");
                    System.out.println(filthyDungeon.getTrapCoordinateX() + ", " + filthyDungeon.getTrapCoordinateY());


                }while(!player.isTrapped(filthyDungeon.getTrapCoordinateX(), filthyDungeon.getTrapCoordinateY()) &&
                        !player.isFinished(filthyDungeon.getEndPortalCoordinateX(), filthyDungeon.getEndPortalCoordinateY()));

                if(player.isTrapped(filthyDungeon.getTrapCoordinateX(), filthyDungeon.getTrapCoordinateY()))
                {
                    filthyDungeon.printTrapMessage();
                }
                else if (player.isFinished(filthyDungeon.getEndPortalCoordinateX(), filthyDungeon.getEndPortalCoordinateY()))
                {
                    filthyDungeon.printEndMessage();
                }

                break;
            case 2:
                Dungeon jungleDungeon = new JungleDungeon(5, 5, "Jungle Dungeon");
                jungleDungeon.setTraps();
                jungleDungeon.setEndPortalCoordinates();

                do{
                    System.out.println("Commence a movement (W - up, A - left, S - down, D - right): ");
                    movement = scanner.nextLine();
                    if(movement.equals("W") || movement.equals("w"))
                    {
                        player.moveUp(jungleDungeon.getMaxCoordinateY());
                    }
                    else if (movement.equals("A") || movement.equals("a"))
                    {
                        player.moveLeft(jungleDungeon.getMaxCoordinateX());
                    }
                    else if (movement.equals("S") || movement.equals("s"))
                    {
                        player.moveDown(jungleDungeon.getMaxCoordinateY());
                    }
                    else if (movement.equals("D") || movement.equals("d"))
                    {
                        player.moveRight(jungleDungeon.getMaxCoordinateX());
                    }
                    else
                    {
                        System.out.println("Invalid movement, please try again");
                    }

                    System.out.println("("+ player.getCurrentCoordinateX() + " , " + player.getCurrentCoordinateY() + ")");
                    System.out.println(jungleDungeon.getTrapCoordinateX() + ", " + jungleDungeon.getTrapCoordinateY());

                }while(!player.isTrapped(jungleDungeon.getTrapCoordinateX(), jungleDungeon.getTrapCoordinateY()) &&
                        !player.isFinished(jungleDungeon.getEndPortalCoordinateX(), jungleDungeon.getEndPortalCoordinateY()));

                if(player.isTrapped(jungleDungeon.getTrapCoordinateX(), jungleDungeon.getTrapCoordinateY()))
                {
                    jungleDungeon.printTrapMessage();
                }
                else if (player.isFinished(jungleDungeon.getEndPortalCoordinateX(), jungleDungeon.getEndPortalCoordinateY()))
                {
                    jungleDungeon.printEndMessage();
                }
                break;
            case 3:
                Dungeon alienDungeon = new AlienDungeon(5, 5, "Alien Dungeon");
                alienDungeon.setTraps();
                alienDungeon.setEndPortalCoordinates();

                do {
                    System.out.println("Commence a movement (W - up, A - left, S - down, D - right): ");
                    movement = scanner.nextLine();
                    if(movement.equals("W") || movement.equals("w"))
                    {
                        player.moveUp(alienDungeon.getMaxCoordinateY());
                    }
                    else if (movement.equals("A") || movement.equals("a"))
                    {
                        player.moveLeft(alienDungeon.getMaxCoordinateX());
                    }
                    else if (movement.equals("S") || movement.equals("s"))
                    {
                        player.moveDown(alienDungeon.getMaxCoordinateY());
                    }
                    else if (movement.equals("D") || movement.equals("d"))
                    {
                        player.moveRight(alienDungeon.getMaxCoordinateX());
                    }
                    else
                    {
                        System.out.println("Invalid movement, please try again");
                    }
                    System.out.println("("+ player.getCurrentCoordinateX() + " , " + player.getCurrentCoordinateY() + ")");
                    System.out.println(alienDungeon.getTrapCoordinateX() + ", " + alienDungeon.getTrapCoordinateY());

                }while(!player.isTrapped(alienDungeon.getTrapCoordinateX(), alienDungeon.getTrapCoordinateY()) &&
                        !player.isFinished(alienDungeon.getEndPortalCoordinateX(), alienDungeon.getEndPortalCoordinateY()));

                if(player.isTrapped(alienDungeon.getTrapCoordinateX(), alienDungeon.getTrapCoordinateY()))
                {
                    alienDungeon.printTrapMessage();
                }
                else if (player.isFinished(alienDungeon.getEndPortalCoordinateX(), alienDungeon.getEndPortalCoordinateY()))
                {
                    alienDungeon.printEndMessage();
                }
                break;
        }
    }
    public static void printDungeonSelection()
    {
        System.out.println("SELECT STAGE");
        System.out.println("[1] Filthy Dungeon");
        System.out.println("[2] Jungle Dungeon");
        System.out.println("[3] Alien Dungeon");
        System.out.println("-----------------------");
    }
}
