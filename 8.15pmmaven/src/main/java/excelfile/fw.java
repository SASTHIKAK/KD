package excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class fw {

	
	@Test
	public void t1() throws IOException
	{
		// apache poi, apache poi ooxml, apache poi ooxml schema
		// reach the destination
		File f= new File("C:\\Users\\hp\\Desktop\\My Contact Form - Copy 2.xlsx");
		// fetch the file 
		FileInputStream fis= new FileInputStream(f);
		//converting to work book
		XSSFWorkbook x= new XSSFWorkbook(fis);
		// getting into the sheet
		XSSFSheet sheet = x.getSheetAt(0);
		
		// number of rows in it
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		
		//number of columns: be specific about row number
		int cell=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in Row 0 is "+ cell);
		
		// row index, column index 
		//2,1
		XSSFCell data = sheet.getRow(2).getCell(1);
		System.out.println(data);
		
		//71,0 => write
		sheet.getRow(66).createCell(2).setCellValue("EIGHTPM");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);
		
	}
}
