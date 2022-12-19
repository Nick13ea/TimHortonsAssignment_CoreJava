package com.company.TimsAssignment;

public class Bagel implements TimsConsumable{
    @Override
    public int getCalories() {
        return 400;
    }

    @Override
    public String getName() {
        return "Bagels";
    }

    @Override
    public Double getPrice() {
        return 3.5;
    }

    @Override
    public String toString() {
        return "Item: Bagels & Price: $3.5 ";
    }
}
