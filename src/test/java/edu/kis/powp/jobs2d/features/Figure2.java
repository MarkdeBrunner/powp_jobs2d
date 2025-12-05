package edu.kis.powp.jobs2d.features;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class Figure2 implements TestFigure {
    @Override
    public void draw(Job2dDriver driver) {
        FiguresJoe.figureScript2(driver);
    }
}
