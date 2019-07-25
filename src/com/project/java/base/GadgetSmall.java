package com.project.java.base;

import com.project.java.singleton.SerialNumber;

import java.util.ArrayList;
import java.util.List;

public class  GadgetSmall extends Gadget {
    public GadgetSmall() {
        this(SurfaceColor.PAINTED);
    }

    public GadgetSmall(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.GadgetSmall);
    }

    @Override
    public List<WidgetInterface> getWidgets(SurfaceColor color) {
        List<WidgetInterface> myList = new ArrayList<>();
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetSmall(color));
        return myList;
    }

    @Override
    public int getSwitches() {
        return 1;
    }

    @Override
    public int getButtons() {
        return 2;
    }

    @Override
    public String getPowerSource() {
        return "battery";
    }

    @Override
    public float getPrice() {
        return 39.99f;
    }

    @Override
    public int getLights() {
        return 0;
    }
}


