package com.project.java.base;

import java.util.List;

public interface GadgetInterface {
    public List<WidgetInterface> getWidgets(SurfaceColor color);


    public  int getSwitches();
    public  int getButtons();
    public  int getLights();
    public String getPowerSource();
    public String  getSerialNumber();
    public  float getPrice();
    public SurfaceColor getColor();



}


