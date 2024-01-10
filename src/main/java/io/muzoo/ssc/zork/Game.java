package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.CommandFactory;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Game {
    private Player player;
    private boolean exit;

    Room rooms[] = new Room[0];//empty array of rooms


    public Player getPlayer() {
        return player;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    private void setupPlayer() {
        Scanner in = new Scanner(System.in);
        while (player == null) {
            System.out.println("Please enter your name: ");
            String name = in.nextLine();
            if (!StringUtils.isBlank(name)) {
                this.player = new Player(name,0,0);
            }
            System.out.println();
        }
    }

    private void chooseMap() {
        Scanner in = new Scanner(System.in);
        while (player == null) {
            System.out.println("Pick a map from 1-3: ");
            System.out.println();
            System.out.println("You can choose the map " + in.nextInt());
        }
    }

    private void play() {
        Scanner in = new Scanner(System.in);
        while (!exit) {
            CommandFactory.getCommand(in.nextLine()).execute(this);
        }
    }

    public void start() {
        setupPlayer();
        chooseMap();
        play();

    }

    public void executeQuitCommand() {
        System.out.println("Do you want to quit this game?");
        //end the current game and return command prompt to let the user choose the map
    }

    public void executeHelpCommand() {
    }

    public void executeDropCommand() {
    }

    public void executeTakeCommand(Game game) {
    }
}
