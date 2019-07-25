package com.project.java.base;

import com.project.java.singleton.SerialNumber;

import java.util.ArrayList;
import java.util.List;

public class GadgetLarge extends Gadget {
    public  GadgetLarge() {
        this(SurfaceColor.PAINTED);
    }

    public GadgetLarge(SurfaceColor color) {
        super(color);
        this.serialNumber = SerialNumber.getInstance()
                .getNextSerial(ProductType.GadgetLarge);
    }

    @Override
    public List<WidgetInterface> getWidgets(SurfaceColor color) {
       List<WidgetInterface>myList=new ArrayList<>();
       myList.add(new WidgetLarge(color));
        myList.add(new WidgetLarge(color));
        myList.add(new WidgetLarge(color));
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetMedium(color));
        myList.add(new WidgetSmall(color));
        myList.add(new WidgetSmall(color));
        myList.add(new WidgetSmall(color));
        return myList;
    }

    @Override
    public int getSwitches() {
        return 2;
    }

    @Override
    public int getButtons() {
        return 4;
    }

    @Override
    public int getLights() {
        return 5;
    }

    @Override
    public String getPowerSource() {
        return "Generator";
    }

    @Override
    public float getPrice() {
        return 79.99f;
    }

}
