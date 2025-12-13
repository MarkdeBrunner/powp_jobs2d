package edu.kis.powp.command;

import edu.kis.powp.command.api.DriverCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPostionCommand implements DriverCommand {
    private final Job2dDriver driver;
    private final int x;
    private final int y;

    public SetPostionCommand(Job2dDriver driver, int x, int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.setPosition(x, y);
    }

}
