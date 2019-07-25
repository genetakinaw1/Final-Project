package com.project.java.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTaker {
    private List<GadgetInterface> gadgetList;
    public void beginOrder(){
        gadgetList=new ArrayList<>();
        System.out.println("Welcome to the Wag Corporation. ");
        addToOrder();
        Receipt myReceipt = new Receipt (gadgetList);
        myReceipt.printReceipt();
    }
    private void addToOrder(){
        Scanner in= new Scanner(System.in);
        System.out.println("What type of Gadget would you like?");
        System.out.println("(L)arg;(M)edium or (S)mall");
        String valueType =in.nextLine();
        System.out.println("What surface would you like?");
        System.out.println("1 for plain,2 for painted or 3 for plated");
        //validate the number
        int valueNum = in.nextInt();
        in.nextLine();
        GadgetInterface value=validateGadgetInput(valueType,
                validateSurfaceColorInput(String.valueOf(valueNum)));
        //Add Gadget to the list
        System.out.println("Does this complete your order? Yes or No");
        String order = in.nextLine();
        if (order.equals("No") || order.equals("no")) {
            gadgetList.add(value);
            this.addToOrder();
        }else{
            gadgetList.add(value);
        }


    }
    private GadgetInterface validateGadgetInput(String value,SurfaceColor color){
        switch (value.toUpperCase()){
            case "L":
            case "Large":
                return new GadgetLarge(color);
            case "M":
            case "Medium":
                return new GadgetMedium(color);
            case "S":
            case "Small":
                return new GadgetSmall(color);
            default:
                return null;
        }
    }
    private SurfaceColor validateSurfaceColorInput(String value){
        switch (value.toUpperCase()){
            case "1":
                return SurfaceColor.PLAIN;
            case "2":
                return SurfaceColor.PAINTED;
            case "3":
                return SurfaceColor.PLATED;
            default:
                return SurfaceColor.PLAIN;
        }
    }
}
