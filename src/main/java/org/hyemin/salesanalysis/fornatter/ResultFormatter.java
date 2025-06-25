package org.hyemin.salesanalysis.fornatter;

import org.hyemin.salesanalysis.model.CategoryTrend;

import java.util.List;

public class ResultFormatter {
    public static String toJson(List<CategoryTrend> trends) {
        StringBuilder sb = new StringBuilder("[\n");
        for (CategoryTrend t : trends) {
            sb.append(String.format("  { \"category\": \"%s\", \"previousSales\": %d, \"currentSales\": %d, \"growthRate\": %.2f },\n",
                    t.getCategory(), t.getPreviousSales(), t.getCurrentSales(), t.getGrowthRate()));
        }
        if (!trends.isEmpty()) sb.setLength(sb.length() - 2); // remove last comma
        sb.append("\n]");
        return sb.toString();
    }
}
