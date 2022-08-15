package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public XSSFWorkbook workbook;

	public ExcelReader(String filePath) {
		File f = new File(filePath);
	
			try {
				FileInputStream fis = new FileInputStream(f);
				workbook = new XSSFWorkbook(fis);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		
	}

	public String getDataFromExcelSheet(int sheetIndex, int rows, int cells) {

		try {
			return workbook.getSheetAt(sheetIndex).getRow(rows).getCell(cells).getStringCellValue();
		} catch (Exception e) {
			double d = workbook.getSheetAt(sheetIndex).getRow(rows).getCell(cells).getNumericCellValue();
			return Long.toString((long) d);
		}
	}

	public int countTotalRows(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum()+1;
	}

	public int countTotalcells(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

}
