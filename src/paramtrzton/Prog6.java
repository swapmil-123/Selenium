package paramtrzton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import graphql.language.Value;

public class Prog6 {

//	private static final char[] Value<Value> = null;

	public static void main(String[] args) throws Exception {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\new\\Book1.xlsx");
		Sheet z = WorkbookFactory.create(file).getSheet("Sheet5");
		
		
		//for read specific value
		String value1 = z.getRow(0).getCell(0).getStringCellValue();
		System.out.println("first value="+value1);
		
		//for read complete sheet
	for(int row=0;row<z.getLastRowNum();row++)
	{
		for(int clm=0;clm<z.getRow(row).getLastCellNum();clm++)
		{
			String value = z.getRow(row).getCell(clm).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
}