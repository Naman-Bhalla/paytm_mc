package dev.naman.commands;

import java.util.List;

public class UpdateUserCommand implements ICommand {

    @Override
    public boolean canExecute(String command) {
        List<String> input = List.of(command.split(" "));

        if (input.get(0).equals(CommandKeywords.UpdateUser)) {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String command) {

    }
}
