package edu.kis.powp.command;

import edu.kis.powp.command.api.DriverCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private final Job2dDriver driver;
    private final int x;
    private final int y;
    
    public OperateToCommand(Job2dDriver driver, int x, int y) {
        this.driver = driver;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.operateTo(x, y);
    }

}
