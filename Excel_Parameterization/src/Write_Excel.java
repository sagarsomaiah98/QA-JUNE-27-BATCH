import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Workbook wb = new XSSFWorkbook();
		
		try (OutputStream fileOut = new FileOutputStream("S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\Excel_Parameterization\\src\\TEST DATA\\NEW.xlsx")) {
			
			Sheet s1 = wb.createSheet("SHEET A");
			Sheet s2 = wb.createSheet("SHEET B");
			
			// Create a row and put some cells in it. Rows are 0 based.
			Row r1 = s1.createRow(0);
			Row r2=s1.createRow(1);
			Row r3= s1.createRow(2);
			
			// Create a cell and put a value in it.
			Cell c1 = r3.createCell(6);// first row column 6
			Cell c2= r3.createCell(7); //first row column 7
			Cell c3= r3.createCell(8); //first row column 8
			
			c1.setCellValue(456);
			c2.setCellValue("Hello");
			c3.setCellValue(56.23);
			
			
		    wb.write(fileOut);
		}
		
		System.out.println("end");

	}

}
