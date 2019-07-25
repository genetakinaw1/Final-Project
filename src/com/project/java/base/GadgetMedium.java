package com.project.java.base;

import com.project.java.singleton.SerialNumber;

import java.util.ArrayList;
import java.util.List;

public class GadgetMedium extends Gadget {
    public  GadgetMedium() {
        this(SurfaceColor.PAINTED);
    }

    public GadgetMedium(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.GadgetMedium);
    }

    @Override
    public List<WidgetInterface> getWidgets(SurfaceColor color) {
        List<WidgetInterface> myList = new ArrayList<>();
        myList.add(new WidgetLarge(color));
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetSmall(color));
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
    public int getLights() {
        return 3;
    }

    @Override
    public String getPowerSource() {
        return "Solar";
    }

    @Override
    public float getPrice() {
        return 59.99f;
    }

}
