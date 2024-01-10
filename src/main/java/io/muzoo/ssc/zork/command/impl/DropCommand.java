package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.command.Command;

public class DropCommand implements Command {
    @Override
    public void execute(Game game) {
        game.executeDropCommand();

    }
}
