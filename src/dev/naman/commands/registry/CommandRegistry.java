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
