package org.hyemin.salesanalysis.model;

public class CategoryTrend {
    private String category;
    private int previousSales;
    private int currentSales;
    private double growthRate;

    public CategoryTrend(String category, int previousSales, int currentSales, double growthRate) {
        this.category = category;
        this.previousSales = previousSales;
        this.currentSales = currentSales;
        this.growthRate = growthRate;
    }

    public String getCategory() { return category; }
    public int getPreviousSales() { return previousSales; }
    public int getCurrentSales() { return currentSales; }
    public double getGrowthRate() { return growthRate; }
}