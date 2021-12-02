package dev.naman.commands;

public interface ICommand {

    /**
     *
     * @param command
     * @return True if the command received in
     * input can be executed by this class.
     */
    boolean canExecute(String command);


    void execute(String command);
}
