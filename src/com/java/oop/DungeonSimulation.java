package com.java.oop;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by kenneth on 3/10/17.
 */
public class DungeonSimulation {

    public static String movement;

    public static String choice;

    static Scanner scanner = new Scanner(System.in);

    static Random randomize = new Random();

    static Player player = new Player("Player 1", 1, 1);

    public static void playFilthyDungeon()
    {
        Dungeon filthyDungeon = new FilthyDungeon(5, 5, "Filthy Dungeon");
        filthyDungeon.setTraps();
        filthyDungeon.setEndPortalCoordinates();
        movement = "";
        player.setCurrentCoordinateX(1);
        player.setCurrentCoordinateY(1);
        do{
            filthyDungeon.printMap(player.getCurrentCoordinateX(), player.getCurrentCoordinateY());
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
            playAgainQuestion();
        }
        else if (player.isFinished(filthyDungeon.getEndPortalCoordinateX(), filthyDungeon.getEndPortalCoordinateY()))
        {
            filthyDungeon.printEndMessage();
            return;
        }

    }

    public static void playJungleDungeon()
    {
        Dungeon jungleDungeon = new JungleDungeon(5, 5, "Jungle Dungeon");
        jungleDungeon.setTraps();
        jungleDungeon.setEndPortalCoordinates();
        movement = "";
        player.setCurrentCoordinateX(1);
        player.setCurrentCoordinateY(1);
        do{
            jungleDungeon.printMap(player.getCurrentCoordinateX(), player.getCurrentCoordinateY());
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
            playAgainQuestion();
        }
        else if (player.isFinished(jungleDungeon.getEndPortalCoordinateX(), jungleDungeon.getEndPortalCoordinateY()))
        {
            jungleDungeon.printEndMessage();
            return;
        }
    }

    public static void playAlienDungeon()
    {
        Dungeon alienDungeon = new AlienDungeon(5, 5, "Alien Dungeon");
        alienDungeon.setTraps();
        alienDungeon.setEndPortalCoordinates();
        movement = "";
        player.setCurrentCoordinateX(1);
        player.setCurrentCoordinateY(1);
        do {
            alienDungeon.printMap(player.getCurrentCoordinateX(), player.getCurrentCoordinateY());
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
            playAgainQuestion();
        }
        else if (player.isFinished(alienDungeon.getEndPortalCoordinateX(), alienDungeon.getEndPortalCoordinateY()))
        {
            alienDungeon.printEndMessage();
            playAgainQuestion();
        }

    }

    public static void playAgainQuestion()
    {
        String choice;
        System.out.println("Do you want to play again?(yes/no) : ");
        choice = scanner.nextLine();

        if (choice.equals("yes"))
        {
            playDungeons();
        }
        else
        {
            System.exit(0);
        }
    }

    public static void playDungeons()
    {
        playFilthyDungeon();
        playJungleDungeon();
        playAlienDungeon();
    }

    public static void initPlayDungeons()
    {
        System.out.println("Press Enter to start.");
        String enter = scanner.nextLine();
        if (enter.equals(""))
        {
            playDungeons();
        }
    }
    public static void main(String[] args) {
        initPlayDungeons();
    }
}
