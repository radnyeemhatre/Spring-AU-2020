package Shopping;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Cart {
	private List<item> itemlist=new LinkedList<item>();
	private List<Integer> qt=new LinkedList<Integer>();
	void additem(item i,int qu)
	{
		if(i.getavail()>=qu)
		{
			if(this.itemlist.contains(i))
			{
				int index=this.itemlist.indexOf(i);
				int q=this.qt.get(index);
				this.qt.set(index,(q+qu));
				i.getreduce(qu);
			}
			else {
				this.itemlist.add(i);
				this.qt.add(qu);
				i.getreduce(qu);
			}
			System.out.print(i.getname()+" added sucessfully");
		}
		else
		{
			System.out.print(i.getname()+" not in sufficient quantity");
		}
		
	}
	void removeitem(item i)
	{
		
		if(this.itemlist.contains(i))
		{
			int index=this.itemlist.indexOf(i);
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter Quantity to be removed");
			int q=sc.nextInt();
			int adq=this.qt.get(index);
			if(adq>=q)
			{
				this.qt.set(index,adq-q);
				i.getincrease(q);
				System.out.print(q+"quantities of  "+i.getname()+" removed sucessfully");
				if(this.qt.get(index)<=0)
				{
					this.itemlist.remove(i);
					this.qt.remove(i);
				}
			}
			else {
				System.out.print(i.getname()+"not in sufficient quantity");
			}
		}
		else {
			System.out.print(i.getname()+" doesnot exist in cart");
		}
			
	}
	void dispalyitems()
	{
		if(this.itemlist.size()<=0)
		{
			System.out.println("Cart is Empty");
			return;
		}
		System.out.printf("%14s %16s %5s %10s\n","Item id","Name","Price","Quantity");
		for(int i=0;i<this.itemlist.size();i++)
		{
			item it=this.itemlist.get(i);
			System.out.printf("%14d %16s %5d %10d\n",it.getid(),it.getname(),it.getprice(),this.qt.get(i));
		}
	}
	List<item> getitems()
	{
		return this.itemlist;
	}
	List<Integer> getquan()
	{
		return this.qt;
	}
	void initializecart()
	{
		this.itemlist=null;
		this.qt=null;
	}
	
}
