import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {


	public static void ExcelData () {
		
		try {
				
		XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Dell\\Documents\\Eclipse_Workspaces\\Workspace_Apr_23\\Excel\\Data\\ExcelData.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		String data0 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data" +data0);
		} catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExcelData();
	}

}
