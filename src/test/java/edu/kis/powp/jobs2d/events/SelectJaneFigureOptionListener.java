package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.Jobs2dDriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;



public class SelectJaneFigureOptionListener implements ActionListener {
   private final DriverManager driverManager;

    public SelectJaneFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(
                new Jobs2dDriverAdapter(driverManager.getCurrentDriver())
        );
    }
}
