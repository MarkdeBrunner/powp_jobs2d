package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commandList = new ArrayList<>();
    
    public void addCommand(DriverCommand command) {
        commandList.add(command);
    }

    public void removeCommand(DriverCommand command) {
        commandList.remove(command);
    }

    @Override
    public void execute() {
        for (DriverCommand command : commandList) {
            command.execute();
        }
    }

}
