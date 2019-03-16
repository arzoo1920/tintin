package util;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Excel ex=new Excel("D:\\Book1.xlsx");
		System.out.println(ex.rowCount("Sheet1"));
		System.out.println(ex.Read("Sheet1", 1, 2));
		System.out.println(ex.cellCount("Sheet1", 2));
	}

}
