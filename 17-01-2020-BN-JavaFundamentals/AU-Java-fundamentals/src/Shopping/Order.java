package Shopping;

import java.util.LinkedList;
import java.util.List;

public class Order {
	private int U_id;
	private int Order_id=0;
	private List <item> list =new LinkedList();
	private List<Integer> qt=new LinkedList<Integer>();
	private String Status=" ";
	private int cost=0;
	Order(int o_id,int c_id,List<item> k,List<Integer> p) {
		this.Order_id=o_id;
		this.U_id=c_id;
		this.list.addAll(k);
		this.qt.addAll(p);
		this.cal_cost();
		this.Status="placed";
		System.out.println("\nOrder Placed \n Orderid: "+this.Order_id+" Cost: "+this.cost);
	}
	private void cal_cost()
	{
		System.out.printf(" %14s %10s %6s %15s %6s \n","Item id","Name","price","Quantity","Total Cost");
		for(int i=0;i<this.list.size();i++)
		{
			
			item u=list.get(i);
			System.out.printf(" %14d %10s %6d %15d %16d \n",u.getid(),u.getname(),u.getprice(),this.qt.get(i),(u.getprice()*this.qt.get(i)));
			this.cost+=u.getprice()*this.qt.get(i);
		}
		System.out.printf("%45s %6d\n","Total",this.cost);
	}
	public void cancel_order(int cust_id)
	{
		if(cust_id!=this.U_id)
		{
			System.out.println("Specified order Doesnot Exist for you");
			
		}
		else if(this.Status.equals("canceled")) {
			System.out.println("Order is already Canceled");
			
		}
		else {
			for(int i=0;i<this.list.size();i++)
			{
				item it=list.get(i);
				it.getincrease(this.qt.get(i));
				this.qt.set(i, 0);
				this.Status="canceled";
			}
			System.out.println("Order : "+this.Order_id+" Canceled Successfully");
		}
		
	}
	public void print_order()
	{
		
		System.out.printf("%10s %15s %6d %10s\n",this.Order_id,this.U_id,this.cost,this.Status);
	}
	public int getid()
	{
		return this.Order_id;
	}
	public int getcid()
	{
		return this.U_id;
	}
	
}
