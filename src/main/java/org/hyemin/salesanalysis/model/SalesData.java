package org.hyemin.salesanalysis.model;

import java.time.LocalDate;

public class SalesData {
    private LocalDate date;
    private String category;
    private String subcategory;
    private int salesAmount;
    private int orderCount;

    public SalesData(LocalDate date, String category, String subcategory, int salesAmount, int orderCount) {
        this.date = date;
        this.category = category;
        this.subcategory = subcategory;
        this.salesAmount = salesAmount;
        this.orderCount = orderCount;
    }

    @Override
    public String toString() {
        return "SalesData{" +
                "date=" + date +
                ", category='" + category + '\'' +
                ", subcategory='" + subcategory + '\'' +
                ", salesAmount=" + salesAmount +
                ", orderCount=" + orderCount +
                '}';
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public int getOrderCount() {
        return orderCount;
    }
}
