package Shopping;

import java.util.List;

public class functions {
	void displaydata(item i[])
	{
		System.out.printf("%4s %16s %5s %10s\n","id","name","price","available");
		for(int k=0;k<20;k++)
			i[k].display();
	}
	void displaydata(Cart c) {
		c.dispalyitems();
	}
	void displaydata(List<Order> orders,int cu) {
		System.out.printf("%10s %15s %6s %10s\n\n","Order Id","Customer Id","Cost","Status");
		for(Order o:orders)
			if(o.getcid()==cu)
			o.print_order();
	}
}
