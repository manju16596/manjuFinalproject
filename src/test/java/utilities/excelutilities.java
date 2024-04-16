package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutilities {
	public static class excelRedbus {
		public static int getRowCount(String x1,String sheet) {
			try {
				FileInputStream fi=new FileInputStream(x1);
				try (XSSFWorkbook w = new XSSFWorkbook(fi)) {
					XSSFSheet s=w.getSheet(sheet);
					
					return s.getLastRowNum();
				}
			}
			catch(Exception e){
				return 0;
			}
		}
		
		public static String getCellValue(String x1,String sheet,int r,int c) {
			try {
				
				FileInputStream fi=new FileInputStream(x1);
				try (XSSFWorkbook w = new XSSFWorkbook(fi)) {
					XSSFSheet s=w.getSheet(sheet);
	XSSFCell cell=s.getRow(r).getCell(c);
					
					if(cell.getCellType()==CellType.STRING) {
						return cell.getStringCellValue();
					}
					else {
						return cell.getRawValue();
					}
				}
			}
			catch(Exception e) {
				return " ";
			}
		}
	}





}



