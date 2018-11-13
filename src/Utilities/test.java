package Utilities;

public class test {

	public static void main(String[] args) {
		ExcelWriteandRead ex;
		ex= new ExcelWriteandRead("D:\\Ajay_new_selenium work\\TestData.xlsx");
	String data=	ex.getData(0, 2, 1);
		System.out.println("data IS " +data);

	}

}
