package Shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Welcome {
	static int customers;
	
	static item[] items =new item[20];
	
	public static void main(String args[]) {
		functions f=new functions();
		Scanner sc=new Scanner(System.in);
		initialize(items);	
		Customer cust=new Customer();
		boolean exit=false;
		System.out.println("Welcome");
		do {
			//Creating customer
			System.out.println("Enter e to exit \nAre you a new customer: (y/n)");
			char k=sc.next().charAt(0);
			switch(k) {
			case 'y' :customers++;
				cust=new Customer(customers);
				System.out.println("Your Customer id is : "+customers);
				//Begin Customer operations
				cust.start(items);
				break;
			case 'n':System.out.println("Enter Your Customer id");
				int uid=sc.nextInt();
				if(uid>customers) {
					System.out.println("Invalid Customer id");	
					continue;
				}
				else {
					cust=new Customer(uid);
					System.out.println("Welcome Customer id : "+uid);
					//Begin Customer operations
					cust.start(items);
				}
				break;
			case 'e':exit=true;
				initialize(items);
				Customer.initialize();
				break;	
			default : System.out.println("Invalid input"); break;
			}
		
		
		}while(!exit);
		System.out.println("Exit");
		
		
		}
	
	static void  initialize(item[] i)
	{
		customers=0;
		
		for(int j=0;j<20;j++)
			i[j]=new item();
		
		i[0].setdata(1, 20, "milk",10);
		i[1].setdata(2, 25, "bread",3);
		i[2].setdata(3, 50, "grapes",55);
		i[3].setdata(4, 100, "butter",4);
		i[4].setdata(5, 20, "biscuits",9);
		i[5].setdata(6, 20, "choclate",2);
		i[6].setdata(7, 2000, "shoes",33);
		i[7].setdata(8, 60, "apples",43);
		i[8].setdata(9, 10, "pen",8);
		i[9].setdata(10, 40, "notebook",9);
		i[10].setdata(11, 70, "sugar",8);
		i[11].setdata(12, 5, "pencil",8);
		i[12].setdata(13, 40, "bottle",6);
		i[13].setdata(14, 25, "nailpaint",3);
		i[14].setdata(15, 300, "lipstick",3);
		i[15].setdata(16, 500, "googles",7);
		i[16].setdata(17, 25, "earings",8);
		i[17].setdata(18, 250, "necklace",7);
		i[18].setdata(19, 250, "tshirt",7);
		i[19].setdata(20, 300, "pants",6);
		

	}

}
