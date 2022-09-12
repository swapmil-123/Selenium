package paramtrzton;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P1 {

	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\new\\Book1.xlsx");
		Sheet z = WorkbookFactory. create(file).getSheet("Sheet1");
		String value = z.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		

		String value1 = z.getRow(0).getCell(2).getStringCellValue();
		System.out.println(value1);
		
		String value2 = z.getRow(0).getCell(3).getStringCellValue();
		System.out.println(value2);
		
		FileInputStream filez=new FileInputStream("");
		Sheet	z1=WorkbookFactory.create(file).getSheet("");
		String valuez=z1.getRow(0).getCell(0).getStringCellValue();

	}

}
