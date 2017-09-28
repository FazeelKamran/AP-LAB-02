package ecafe;
import java.util.Scanner; 

public class DataLoad {

	private String item;
	private String price;
	private String description; 
	private static int y;
	private static int p;
	private static int t;

	
	DataLoad(){                 //constructor
		this.item = "";
		this.price = "";
		this.description = "";
		
		
	}
	
	public void setFromFile(String Name , String cost  , String detail) {
		this.item = Name;           //setting values
		this.price = cost;
		this.description = detail;
	}
	
	public String getName() {
		return this.item;
	}
	
	public String getRole()
	{
		return this.description;
	}
	public String getScore() {
		return this.price;
	}
	
	public void print() {                     //printing menu items
		System.out.println(this.item);
		System.out.println(this.price);
		System.out.println(this.description);
	}
	public void order()
	{
		
	    System.out.println("Choose your order(only enter the serial numbers e.g. 5). Enter 0 to finish the order.");
	    Scanner sc=new Scanner(System.in);  
		 y=sc.nextInt();
	    t=0;
	    p=0;
	    while(y!=0)
	    {
		    Scanner sc1=new Scanner(System.in);  
			 y=sc1.nextInt();
	    if(y==0)
	    {
	    	break;
	    }
	    	
	    	
	    	else if(y==1)
	    		{
	    			p=p+ 249;
	    			t=t+7;
	    		}
	    		else if(y==2)
	    		{
	    			p=p+ 399;
	    			t=t+8;
	    		}
	    		else if(y==3)
	    		{
	    			p=p+ 199;
	    			t=t+6;
	    		}
	    		else if(y==4)
	    		{
	    			p=p+ 449;
	    			t=t+7;
	    		}
	    		else if(y==5)
	    		{
	    			p=p+ 349;
	    			t=t+11;
	    		}
	    		else if(y==6)
	    		{
	    			p=p+ 199;
	    			t=t+12;

	    		}
	    		else if(y==7)
	    		{
	    			p=p+ 499;
	    			t=t+13;

	    		}
	    		else if(y==8)
	    		{
	    			p=p+ 399;
	    			t=t+14;

	    		}
	    		else if(y==9)
	    		{
	    			p=p+ 599;
	    			t=t+15;

	    		}
	    		else if(y==10)
	    		{
	    			p=p+ 749;
	    			t=t+10;

	    		}
	    		else if(y==11)
	    		{
	    			p=p+ 349;
	    			t=t+15;
	    		}
	    		else if(y==12)
	    		{
	    			p=p+ 1099;
	    			t=t+14;
	    		}
	    		else if(y==13)
	    		{
	    			p=p+ 149;
	    			t=t+5;
	    		}
	    		else if(y==14)
	    		{
	    			p=p+ 99;
	    			t=t+10;
	    		}
	    		else if(y==15)
	    		{
	    			p=p+ 99;
	    			t=t+12;
	    		}
	    	
		
	    }
	    System.out.println("Price for your order is " + p + " rupees");
	    System.out.println("Time it takes to be done is " + t/4 + " minutes");
		System.out.println("Want to place another order? Press 1. To exit press 0.");
		int n=sc.nextInt();
		if(n==1)
		{
			menuitems.main(null);
		}
		else if(n==0)
		{
			System.out.println("THANK YOU!!!");
		}
	}
}
