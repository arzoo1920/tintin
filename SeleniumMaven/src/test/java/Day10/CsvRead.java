package Day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CsvRead {
  @Test
  public void f() throws IOException {
	  CSVReader cr=new CSVReader(new FileReader(".\\Data.csv"));
	  List<String[]> allData=cr.readAll();
	  for(String rowData[]:allData)
	  {
		  for(String colData:rowData)
		  {
			  System.out.println(colData);
		  }
		//  System.out.println(rowData[0]);
		  //System.out.println(rowData[1]);
	  }
  }
}
