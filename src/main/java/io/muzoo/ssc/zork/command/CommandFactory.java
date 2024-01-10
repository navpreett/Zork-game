package io.muzoo.ssc.zork.command;
import io.muzoo.ssc.zork.command.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    public static Map<String, Command> registeredCommands = new HashMap<>();
    static {
        registeredCommands.put("info", new InfoCommand());
        registeredCommands.put("exit", new InfoCommand());
        registeredCommands.put("help", new InfoCommand());
        registeredCommands.put("quit", new InfoCommand());
        registeredCommands.put("drop", new InfoCommand());
        registeredCommands.put("take", new InfoCommand());
    }
    public static Command getCommand(String input){
        Command command = registeredCommands.get(input);
        if(command!=null) {
            return command;
        }
        else {
            return registeredCommands.get("help");
        }
    }
}



