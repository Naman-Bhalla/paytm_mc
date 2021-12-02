package dev.naman.commands;

import dev.naman.controller.UserController;

import java.util.List;

public class RegisterUserCommand implements ICommand{
    private UserController userController = new UserController();

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
        userController.registerUser(null, null);
        System.out.println("In Register User Command");
    }
}
