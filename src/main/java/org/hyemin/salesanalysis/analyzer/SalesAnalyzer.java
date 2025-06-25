package org.hyemin.salesanalysis.analyzer;

import org.hyemin.salesanalysis.model.SalesData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesAnalyzer {
    //카테고리별 판매 계산
    public static Map<String, Integer> calculateSalesByCategory(List<SalesData> salesList) {
        return salesList.stream().collect(
                Collectors.groupingBy(
                        SalesData::getCategory,                          // ✅ 카테고리별 그룹핑
                        Collectors.summingInt(SalesData::getSalesAmount) // ✅ 매출 합계만 계산
                )
        );
    }

}
