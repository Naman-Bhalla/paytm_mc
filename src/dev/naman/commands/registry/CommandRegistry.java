package dev.naman.commands.registry;

import dev.naman.commands.ICommand;
import dev.naman.commands.registry.exceptions.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistry {
    private List<ICommand> commands = new ArrayList<>();

    public void registerCommand(ICommand command) {
        commands.add(command);
    }

    public void executeCommand(String command) {
        for (ICommand c: commands) {
            if (c.canExecute(command)) {
                c.execute(command);
                return;
            }
        }

        throw new InvalidCommandException();
    }
}


Command Registry: A class that stores all the commandClasses that I may have
and allows he clients to execute a string.
It searches in all the commands that were registered and if any of them matches the string
it runs