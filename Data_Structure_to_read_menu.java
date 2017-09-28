package ecafe;

import java.util.ArrayList;
import java.io.*;
public class Data_Structure_to_read_menu {
	public ArrayList<DataLoad> users =new ArrayList<DataLoad>();
	private String fileName;
	
	Data_Structure_to_read_menu() throws IOException{
		fileName = "Menuitems.txt";
		 BufferedReader br = new BufferedReader(new FileReader(fileName));
		 try {
		        
		        String line ="" ;

		        while (line != null) {
		        	String name = br.readLine() ;
		        	String price = br.readLine();
		        	String description = br.readLine();
		        	DataLoad temp  = new DataLoad();
		        	temp.setFromFile(name, price, description);
		        	line = br.readLine();
		        	users.add(temp);
		        	temp.print();
		        	
		        	
		        }
		    } finally {
		        br.close();
		    }
	}
	
	
}
