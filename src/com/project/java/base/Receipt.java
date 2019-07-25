package com.project.java.base;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<GadgetInterface>gadgetList;
    private List<WidgetInterface>largeWidgetList;
    private List<WidgetInterface>mediumWidgetList;
    private List<WidgetInterface>smallWidgetList;
    private float priceTotal;

    Receipt(List<GadgetInterface>gadgetList){
        this.gadgetList = new ArrayList<>();
        this.gadgetList = gadgetList;
        getWidgetList();
    }
    void printReceipt(){
        System.out.println();
        System.out.println();
        System.out.println("Wag Corporation");
        System.out.println("*********");
        System.out.println();
        System.out.println("Gadget");
        printGadgets();
        System.out.println();
        printWidgets();
        System.out.println();
       printAccessories();
       System.out.println("*********");
       System.out.println(String.format("%-20s $%s","Total",priceTotal));
    }
    private void getWidgetList(){
        List<WidgetInterface>widgetList = new ArrayList<>();
        largeWidgetList  = new ArrayList<>();
        mediumWidgetList = new ArrayList<>();
        smallWidgetList = new ArrayList<>();

        for(GadgetInterface GadgetList: gadgetList){
            widgetList.addAll(GadgetList.getWidgets(GadgetList.getColor()));
        }
        for (int i = 0; i< widgetList.size();i++){

            if(widgetList.get(i).getClass().getSimpleName().equals("widgetLarge")){
                largeWidgetList.add(widgetList.get(i));
            }
            if(widgetList.get(i).getClass().getSimpleName().equals("widgetMedium")){
                mediumWidgetList.add(widgetList.get(i));
            }
            if(widgetList.get(i).getClass().getSimpleName().equals("widgetSmall")){
                smallWidgetList.add(widgetList.get(i));
            }

        }


    }
    private void printGadgets(){
        for(GadgetInterface GadgetList: gadgetList){
            String type = GadgetList.getClass().getSimpleName();
            String color = GadgetList.getColor().toString();
            float price = GadgetList.getPrice();
            priceTotal += price;
            System.out.println(String.format("%s %-20s $%s",color, type,price));
        }
    }
    private void printWidgets(){
        System.out.println("widgets");
        System.out.println("("+largeWidgetList.size()+")Large Widget");
        System.out.println("("+mediumWidgetList.size()+")Medium Widget");
        System.out.println("("+smallWidgetList.size()+")Small Widget");
    }
    private void printAccessories(){
        System.out.println("Accessories");
        if(getLights()> 0){
            System.out.println("("+ getLights() +")Lights");
        }
        System.out.println("("+ getSwitches() +")Switches");
        System.out.println("("+ getButtons() +")Buttons");
        for(GadgetInterface GadgetList: gadgetList){
            String Powersource = GadgetList.getPowerSource();
            System.out.println(Powersource);
        }
    }
    private  int getLights(){
        int totalLights = 0;
        for(GadgetInterface GadgetList : gadgetList){
            totalLights += GadgetList.getLights();
        }
        return  totalLights;
    }
    private  int getButtons(){
        int totalButtons = 0;
        for (GadgetInterface GadgetList : gadgetList){
            totalButtons += GadgetList. getButtons();
        }
        return totalButtons;
    }
    private  int getSwitches(){
        int totalSwitches=0;
        for (GadgetInterface GadgetList : gadgetList){
            totalSwitches += GadgetList. getSwitches();
        }
        return  totalSwitches;
    }
}
