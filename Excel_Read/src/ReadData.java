
public class ReadData {

	public static void main(String[] args) {
		
		Xls_Reader xls = new Xls_Reader("S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\Excel_Read\\src\\TESTDATA\\TESTSUITE.xlsx");
		
		int rowCount=xls.getRowCount("SAUCE");
		System.out.println(rowCount);
		
		String value=xls.getCellData("SAUCE", "UNAME", 2);
		
		System.out.println(value);
		
	}

}
