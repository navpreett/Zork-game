package io.muzoo.ssc.zork.command.impl;
import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.command.Command;

public class InfoCommand implements Command{
    @Override
    public void execute(Game game) {
        System.out.println("Printing information about room, games and players");
    }
}
