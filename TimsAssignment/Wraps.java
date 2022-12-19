package com.company.TimsAssignment;

public class Wraps implements TimsConsumable {
    @Override
    public int getCalories() {
        return 600;
    }

    @Override
    public String getName() {
        return "Wraps";
    }

    @Override
    public Double getPrice() {
        return 7.99;
    }

    @Override
    public String toString() {
        return "Item: Wraps & Price: $7.99 ";
    }
}
