package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class Jobs2dDriverAdapter extends AbstractDriver {
    private final Job2dDriver driver;

    public Jobs2dDriverAdapter(Job2dDriver driver) {
        super(0, 0);
        this.driver = driver;
    }    

    
    @Override
    public void operateTo(int x, int y) {
        driver.operateTo(x, y);
    }
}
