package com.project.java.base;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[]args){
        //Run Simulation
        simulation();
        //OrderTaker taker = new OrderTaker();
        //taker.beginOrder();
    }
    //Simulation for testing
    private static void simulation(){
        List<GadgetInterface> gadgetList=gadgetList=new ArrayList<>();
        gadgetList.add(new GadgetLarge());
        gadgetList.add(new GadgetLarge());
        gadgetList.add(new GadgetMedium(SurfaceColor.PLATED));
        gadgetList.add(new GadgetSmall(SurfaceColor.PAINTED));
        //TODO: send it to a receipt class.
        Receipt rec = new Receipt(gadgetList);
        rec.printReceipt();

    }

}
