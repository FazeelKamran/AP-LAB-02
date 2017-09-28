package ecafe;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.Scanner; 
public class menuitems {
	private  Data_Structure_to_read_menu obj;
    private static int x;
	
	public static void main(String[] args) {                       //main function
		 Scanner sc=new Scanner(System.in);  
		        
				System.out.println("Welcome Sir!!! \r\n \r\nWe are providing two services for now. \r\nSelect any option you want ( 1 or 2 ).");
				System.out.println("1->Pick-up Service.   2->Home Delivery.");
				 x=sc.nextInt();              
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								menuitems window = new menuitems();             //object creation
								DataLoad temp2  = new DataLoad();
								temp2.order();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				
				} 

public menuitems() {                        //constructor
	try {
		 Scanner sc=new Scanner(System.in);  

		if(x==1)
		{
			System.out.println("Please enter the Pickup time between 11:00AM AND 10:00PM, and press enter.");
			String time=sc.nextLine();
		 obj=new Data_Structure_to_read_menu();
		}
		else if (x==2)
		{
			System.out.println("Enter the Address and press enter");
			String address=sc.nextLine();
			 obj=new Data_Structure_to_read_menu();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}


public void run() {
	try {
		menuitems window = new menuitems();             //object creation
		DataLoad temp2  = new DataLoad();
		temp2.order();
	} catch (Exception e) {
		e.printStackTrace();
	}
}


} 
