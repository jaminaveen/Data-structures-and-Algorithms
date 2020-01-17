package q8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import q8.Row;

public class DataImport {
	
	ArrayList<Row> inputData = new ArrayList<Row>() ;
	
	public void readData() {
	    try {
	        BufferedReader in = new BufferedReader(
	                               new FileReader("C:\\Users\\navee\\Desktop\\My_Masters_NEU\\Spring2020\\INFO6205_PSA\\Github\\Data-structures-and-Algorithms\\Assignments\\Assignment1\\src\\q8\\input.txt"));
	        String str;

	        while ((str = in.readLine())!= null) {
	        	Row row = new Row();
	            String[] ar=str.split(",");
	            row.id = Integer.parseInt(ar[0]);
	            row.firstName = ar[1];
	            row.lastName = ar[2];
	            row.course = ar[3];
	            inputData.add(row);
	            
	        }
	        in.close();
	        
	    } catch (IOException e) {
	        System.out.println("File Read Error");
	    }
	}

	/*
	public static void main(String[] args) throws Exception {
		DataImport data = new DataImport();
		
		data.readData();
		System.out.println(data.inputData.get(2));
		
	}
	*/

}
