package com.company.TimsAssignment;

public class HockeyCards implements TimsMerchandise{
    @Override
    public String getName() {
        return "Tim Hockey Cards";
    }

    @Override
    public Double getPrice() {
        return 10.0;
    }

    @Override
    public String getFeatures() {
        return "Rare Hockey Cards";

    }
    @Override
    public String toString(){
        return "Item: Hockey Cards & Price: $10";
    }
}
