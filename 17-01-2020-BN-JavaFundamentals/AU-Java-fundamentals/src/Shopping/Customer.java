package Shopping;
import java.util.*;
public class Customer {
	private int c_id;
	private Cart ct;
	static int order=0;
	static List <Order> orderlist=new ArrayList<Order>();
	Customer(int id){
		this.c_id=id;
		ct=new Cart();
		
	}
	Customer()
	{
		//initialize();
	}
	public void start(item items[])
	{
		functions fc=new functions();
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		
		do {
			
		System.out.println("\n Select Your Operation\n");
		System.out.println("1. View All Items");
		System.out.println("2. Add Item to Cart");
		System.out.println("3. Delete Item from Cart ");
		System.out.println("4. View Cart");
		System.out.println("5. Place Order ");
		System.out.println("6. Cancel Order");
		System.out.println("7. View all orders");
		System.out.println("8. EXIT \n");
		
		
		int opt=sc.nextInt();
		switch(opt) {
		case 1:fc.displaydata(items);
				break;
		case 2:System.out.println("Enter Item id to add and quantity");
				int it_add=sc.nextInt();
				int q=sc.nextInt();
				ct.additem(items[it_add-1],q);
				break;
		case 3:
			System.out.println("Enter Item id to remove");
			int it_rem=sc.nextInt();
			ct.removeitem(items[it_rem-1]);
			break;
		case 4:fc.displaydata(ct);
				break;
		case 5:order++;
				Order o=new Order(order, this.c_id, ct.getitems(), ct.getquan());
				orderlist.add(o);
				ct=new Cart();
				break;
		case 6:System.out.println("Enter Order id to Cancel");
				int C_o=sc.nextInt();
				boolean flag=true;
				for( Order ord:orderlist )
				{
					if(ord.getid()==C_o)
					{
						ord.cancel_order(this.c_id);
						flag=false;
						break;
					}
						
				}
				if(flag)
					System.out.println("Specified order Doesnot Exist for you");
				break;
		case 7:fc.displaydata(orderlist,c_id); break;
		case 8:exit=true; break;
		
		}
		
		
		}while(!exit);
		
	}
	public static void initialize()
	{
		order=0;
		orderlist=new ArrayList<Order>();
			
	}
	
	
	
}
