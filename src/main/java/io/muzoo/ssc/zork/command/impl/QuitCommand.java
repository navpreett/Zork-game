package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.command.Command;

public class QuitCommand implements Command {
    @Override
    public void execute(Game game) {
        game.executeQuitCommand();
    }
}
