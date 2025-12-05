package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;


public class LineDrawerAdapter extends DrawerFeature implements Job2dDriver {

	private int startX = 0, startY = 0;
	
	// Przez wybrany mamy na myśli faktycznie "wybrany" z dostępnych typów linii czy SpecialLine wspomniany w
    // części "śpiewno-muzycznej" zadania?
	public enum LineType {
		BASIC, DOTTED, SPECIAL
	}
	
	private LineType lineType = LineType.SPECIAL;

	public LineDrawerAdapter() {
		super();
	}

	
	public LineDrawerAdapter(LineType lineType) {
		super();
		this.lineType = lineType;
	}


	public void setLineType(LineType lineType) {
		this.lineType = lineType;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = getLineByType();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		
		getDrawerController().drawLine(line);
		setPosition(x, y);
	}

	private ILine getLineByType() {
		switch (lineType) {
			case DOTTED:
				return LineFactory.getDottedLine();
			case SPECIAL:
				return LineFactory.getSpecialLine();
			case BASIC:
			default:
				return LineFactory.getBasicLine();
		}
	}

	@Override
	public String toString() {
		return "LineDrawerAdapter (" + lineType + ")";
	}
}
