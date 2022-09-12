package paramtrzton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prog5 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\new\\Book1.xlsx");
		Sheet z = WorkbookFactory.create(file).getSheet("Sheet4");
		
		
		System.out.println("total rows="+z.getLastRowNum());
	
		
		for(int row=0;row<=z.getLastRowNum();row++)
			
		{
			for(int clm=0;clm<z.getRow(clm).getLastCellNum();clm++)
			{
				String value = z.getRow(row).getCell(clm).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();	
		}
		
	}	
		
		
		
		
	}
	
	
	
	
	


