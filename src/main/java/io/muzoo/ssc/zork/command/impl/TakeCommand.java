package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.command.Command;

public class TakeCommand implements Command {
    @Override
    public void execute(Game game) {
        game.executeTakeCommand(game);
    }
}
