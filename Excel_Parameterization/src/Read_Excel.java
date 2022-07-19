

public class Read_Excel {

	public static void main(String[] args) {
		
		Xls_Reader xls= new Xls_Reader("S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\Excel_Parameterization1\\src\\TESTDATA\\TESTDATA.xlsx");
		
		int rowCount=xls.getRowCount("ORDER_INFO");
		
		System.out.println(rowCount);
		
	//	String v1= xls.getCellData("ORDER_INFO", "CUSTOMER_NAME", 8);
		
		for(int i=2;i<=rowCount;i++) {
			
			String v1= xls.getCellData("ORDER_INFO", "ORDER_ID", i);
			String v2= xls.getCellData("ORDER_INFO", "CUSTOMER_NAME", i);
			String v3= xls.getCellData("ORDER_INFO", "TAG_NAME", i);
			System.out.println(v1+"| "+v2+" | "+v3);
			
		}
		
		
		
		
	}

}
