package genericlib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel implements constant {
	

	public static String getdata(String sheet1, int row, int cell)
	{
		String s="";
		//double s1=0;
		try
		{
			FileInputStream f=new FileInputStream(excel2path);
			Workbook wb = WorkbookFactory.create(f);
			s=wb.getSheet(sheet1).getRow(row).getCell(cell).toString();
		
		
			
		}
		catch(Exception e)
		{
	
			
			
		}
	return s;
		
		
	}

}
