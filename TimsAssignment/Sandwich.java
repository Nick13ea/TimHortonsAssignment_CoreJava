package com.company.TimsAssignment;

public class Sandwich implements TimsConsumable {
    @Override
    public int getCalories() {
        return 720;
    }

    @Override
    public String getName() {
        return "Sandwich";
    }

    @Override
    public Double getPrice() {
        return 8.99;
    }

    @Override
    public String toString() {
        return "Item: Sandwich & Price: $8.99 ";
    }
}
