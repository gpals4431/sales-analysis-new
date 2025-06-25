package org.hyemin.salesanalysis.parser;

import org.hyemin.salesanalysis.model.SalesData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//json 혹은 csv 파일 파싱 클래스
public class SalesDataParser {
    public static List<SalesData> parseCsv(String filePath) throws IOException {
        List<SalesData> result = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        for (int i = 1; i < lines.size(); i++) {
            String[] cols = lines.get(i).split(",");
            LocalDate date = LocalDate.parse(cols[0].trim());
            String category = cols[1].trim();
            String subcategory = cols[2].trim();
            int salesAmount = Integer.parseInt(cols[3].trim());
            int orderCount = Integer.parseInt(cols[4].trim());

            result.add(new SalesData(date, category, subcategory, salesAmount, orderCount));
        }

        return result;
    }
}
