package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseDisc {
    private String name;
    private double capacity;
    private ArrayList<Data> contents;
    private boolean isBranded;

    public BaseDisc(String name, double capacity, boolean isBranded) {
        this.name = name;
        this.capacity = capacity;
        this.isBranded = isBranded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Data> getContents() {
        return contents;
    }

    public void setContents(Data contents) {
        this.contents.add(contents);
    }

    public boolean isBranded() {
        return isBranded;
    }

    public void setBranded(boolean branded) {
        isBranded = branded;
    }
}
