package com.company.TimsAssignment;

public class Mugs implements TimsMerchandise{
    @Override
    public String getName() {
        return "Mug";
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }

    @Override
    public String getFeatures() {
        return "Beautiful Tims Mug";
    }

    @Override
    public String toString() {
        return "Item: Mug & Price:$5";
    }
}
