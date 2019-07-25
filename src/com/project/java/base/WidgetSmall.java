package com.project.java.base;

import com.project.java.singleton.SerialNumber;

public class WidgetSmall extends Widget{
    public WidgetSmall(SurfaceColor color){
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.WidgetSmall);
    }

    @Override
    public String getGears() {
        return "2 Gears";
    }

    @Override
    public String getSpring() {
        return "3 Springs";
    }

    @Override
    public String getLevers() {
        return "1 Levers";
    }
}


