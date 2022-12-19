package com.company.TimsAssignment;

public class Donuts implements TimsConsumable {
    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public String getName() {
        return "Donuts";
    }

    @Override
    public Double getPrice() {
        return 2.5;
    }

    @Override
    public String toString() {
        return "Item: Donuts & Price: $2.5 ";
    }
}
