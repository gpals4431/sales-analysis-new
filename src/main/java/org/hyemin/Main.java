package org.hyemin;

import org.hyemin.salesanalysis.analyzer.SalesAnalyzer;
import org.hyemin.salesanalysis.model.SalesData;
import org.hyemin.salesanalysis.parser.SalesDataParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        List<SalesData> salesList = SalesDataParser.parseCsv("D:/hyemin/sales_sample.csv");
        salesList.forEach(salesData -> System.out.println(salesData));

        Map<String, Integer> categorySales = SalesAnalyzer.calculateSalesByCategory(salesList);
        System.out.println("Category Sales:"+categorySales);
    }
}