
public class Read_Excel {

	public static void main(String[] args) {
	
		Xls_Reader xls = new Xls_Reader("S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\Excel_Parameter_Read\\src\\TESTDATA\\TESTSUITE.xlsx");
		
		int rowCount=xls.getRowCount("SAUCE");
		
		System.out.println(rowCount);
		
	String value=	xls.getCellData("SAUCE", "PWD", 2);
	
	//System.out.println(value);
	
	
	for(int i=1;i<=rowCount;i++) {
		
		String col1=	xls.getCellData("SAUCE", "UNAME", i);
		
		String col2=	xls.getCellData("SAUCE", "PWD", i);
		
		System.out.println(col1+"   "+col2);
		
	}
		
		
		

	}

}
