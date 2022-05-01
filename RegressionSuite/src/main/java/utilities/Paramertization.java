package utilities;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramertization{
	
	public static String DataFromExcel(String getsheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\VELOCITY LEC\\SOFTWARE\\ECLIPSE\\ECLIPSE CODE\\SITsuite\\src\\main\\resources\\NewEXfile.xlsx");
		return WorkbookFactory.create(file).getSheet(getsheet).getRow(row).getCell(cell).getStringCellValue();
	}
 
}
