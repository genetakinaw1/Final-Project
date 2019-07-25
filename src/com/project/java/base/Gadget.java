package com.project.java.base;

public abstract class Gadget implements GadgetInterface {
    protected  WidgetInterface Widget;
    private  SurfaceColor color;
    protected String serialNumber;


    public Gadget(){
        this(SurfaceColor.PLAIN);
        }
        public Gadget(SurfaceColor color) {
        this.color = color;
    }
    public SurfaceColor getColor(){
        return  color;
    }

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"was added to the order";
    }


}
