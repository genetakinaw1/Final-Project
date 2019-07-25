package com.project.java.base;

import com.project.java.singleton.SerialNumber;

public class WidgetLarge extends  Widget {
    public WidgetLarge(SurfaceColor color){
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.WidgetLarge);
    }

    @Override
    public String getGears() {
        return "9 Gears";
    }

    @Override
    public String getSpring() {
        return "4 Springs";
    }

    @Override
    public String getLevers() {
        return "2 Levers";
    }
}
