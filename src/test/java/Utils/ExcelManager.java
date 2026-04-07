package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelManager {
	
	private static Workbook workbook;
	
	public static void loadExcel(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        workbook = WorkbookFactory.create(fis);
    }


	public static List<Map<String, String>> getData(String sheetName) {
        List<Map<String, String>> dataList = new ArrayList<>();
        Sheet sheet = workbook.getSheet(sheetName);

        Row headerRow = sheet.getRow(0);
        int colCount = headerRow.getLastCellNum();

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            Map<String, String> dataMap = new HashMap<>();
            for (int j = 0; j < colCount; j++) {
                String key = headerRow.getCell(j).toString();
                String value = row.getCell(j).toString();
                dataMap.put(key, value);
            }
            dataList.add(dataMap);
        }
        return dataList;
    }
	
	public static String getCellData(String sheetName, int row, int col) {
        Sheet sheet = workbook.getSheet(sheetName);
        Row r = sheet.getRow(row);
        Cell c = r.getCell(col);
        return c.toString();
    }




	
	






}
