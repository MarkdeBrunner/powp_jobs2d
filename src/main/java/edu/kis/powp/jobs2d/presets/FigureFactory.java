package edu.kis.powp.jobs2d.presets;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureFactory {
    public static ComplexCommand getCirclePreset(Job2dDriver driver, int centerX, int centerY, int radius, int segments) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driver, centerX, centerY + radius));
        for (int i = 1; i <= segments; i++) {
            double degrees = 2 * Math.PI * i / segments;
            int x = centerX + (int) (radius * Math.sin(degrees));
            int y = centerY + (int) (radius * Math.cos(degrees));
            complexCommand.addCommand(new OperateToCommand(driver, x, y));
        }
        complexCommand.addCommand(new OperateToCommand(driver, centerX, centerY + radius ));
        return complexCommand;
    }

    public static ComplexCommand getRectanglePreset(Job2dDriver driver, int startX, int startY, int width, int height) {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new SetPositionCommand(driver, startX, startY));
        complexCommand.addCommand(new OperateToCommand(driver, startX + width, startY));
        complexCommand.addCommand(new OperateToCommand(driver, startX + width, startY + height));
        complexCommand.addCommand(new OperateToCommand(driver, startX, startY + height));
        complexCommand.addCommand(new OperateToCommand(driver, startX, startY));
        return complexCommand;
    }

    public static ComplexCommand getTrianglePreset(Job2dDriver driver, int centerX, int centerY, int sideLength) {
        ComplexCommand complexCommand = new ComplexCommand();
        double height = (Math.sqrt(3) / 2) * sideLength;
        complexCommand.addCommand(new SetPositionCommand(driver, centerX, (int) (centerY - (height / 3))));
        complexCommand.addCommand(new OperateToCommand(driver, centerX - (sideLength / 2), (int) (centerY + (height * 2 / 3))));
        complexCommand.addCommand(new OperateToCommand(driver, centerX + (sideLength / 2), (int) (centerY + (height * 2 / 3))));
        complexCommand.addCommand(new OperateToCommand(driver, centerX, (int) (centerY - (height / 3))));
        return complexCommand;
    }
}
