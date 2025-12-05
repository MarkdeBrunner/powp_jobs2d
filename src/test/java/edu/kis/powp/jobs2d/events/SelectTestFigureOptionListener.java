package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.features.TestFigure;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final TestFigure testFigure;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestFigure testFigure) {
		this.driverManager = driverManager;
		this.testFigure = testFigure;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		testFigure.draw(driverManager.getCurrentDriver());
	}
}
