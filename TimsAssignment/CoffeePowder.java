package com.company.TimsAssignment;

public class CoffeePowder implements TimsMerchandise{
    @Override
    public String getName() {
        return "Tims Coffee Powder";
    }

    @Override
    public Double getPrice() {
        return 6.0;
    }

    @Override
    public String toString() {
        return "Item: Coffee Powder & Price: $6";
    }

    @Override
    public String getFeatures() {
        return "Exclusive Arabic Taste";
    }
}
