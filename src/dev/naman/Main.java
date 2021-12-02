package dev.naman;

import dev.naman.commands.RegisterUserCommand;
import dev.naman.commands.UpdateUserCommand;
import dev.naman.commands.registry.CommandRegistry;
import dev.naman.commands.registry.exceptions.InvalidCommandException;

public class Main {

    public static void main(String[] args) {
        CommandRegistry commandRegistry = new CommandRegistry();
        commandRegistry.registerCommand(new RegisterUserCommand());
        commandRegistry.registerCommand(new UpdateUserCommand());

//        while (true) {
            String input = "RegisterUser [phone_number] [password]";// get inputs from the console;
            try {
                commandRegistry.executeCommand(input);
            } catch (InvalidCommandException e) {
                System.out.println("The command you entered is invalid");
            }
//        }
	// write your code here
    }
}

// Assignment
// Implement one command - RegisterUserCommand