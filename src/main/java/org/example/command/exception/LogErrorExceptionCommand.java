package org.example.command.exception;


import org.example.command.Command;
import org.example.command.log.LogErrorCommand;

public class LogErrorExceptionCommand implements Command {
    private final Command command;
    private final Exception exception;

    public LogErrorExceptionCommand(Command command, Exception exception) {
        this.command = command;
        this.exception = exception;
    }

    @Override
    public void execute() {
        new LogErrorCommand(command, exception).execute();
    }
}
