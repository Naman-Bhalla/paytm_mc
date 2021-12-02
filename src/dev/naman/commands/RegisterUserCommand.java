package dev.naman.commands;

import java.util.List;

public class RegisterUserCommand implements ICommand{

    @Override
    public boolean canExecute(String command) {
        List<String> input = List.of(command.split(" "));

        if (input.get(0).equals(CommandKeywords.RegisterUser)) {
            return true;
        }
        return false;
    }

    @Override
    public void execute(String command) {

    }
}
