package com.company.TimsAssignment;

public class GiftCards implements TimsMerchandise {
    @Override
    public String getName() {
        return "Tim Gift Cards";
    }

    @Override
    public Double getPrice() {
        return 8.0;
    }

    @Override
    public String getFeatures() {
        return "Exclusive TimHortons Cards";
    }

    @Override
    public String toString() {
        return "Item: Tim Gift Cards & Price : $8";
    }
}

