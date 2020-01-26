package shopping;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Market {
	
	public static void main(String args[])
	{
		CustomerDetails c1=new CustomerDetails();
		c1.setCustomerId(1);
		
		c1.setName("Alice");
		c1.setEmail("alice@s.m");
		Address a1h=new Address(" home Street1", "600081");
		Address a1o=new Address(" office Street1", "569358");
		c1.setHomeAddress(a1h);
		c1.setOffAddress(a1o);

		CustomerDetails c2=new CustomerDetails();
		c2.setCustomerId(2);
		
		c2.setName("Bob");
		c2.setEmail("bob@s.m");
		Address a2h=new Address(" home Street2", "600081");
		Address a2o=new Address(" office Street2", "569358");
		c2.setHomeAddress(a2h);
		c2.setOffAddress(a2o);
		
		OrderAdd o1=new OrderAdd();
		o1.setCustomer(c1);

		OrderAdd o2=new OrderAdd();
		o2.setCustomer(c1);
		
		OrderAdd o3=new OrderAdd();
		o3.setCustomer(c2);
		
		OrderAdd o4=new OrderAdd();
		o4.setCustomer(c2);
		
		DairyItem i1=new DairyItem(1,"Chocolate",10,1);
		Costem i2=new Costem (5,"soap",100,2);
		DairyItem i3=new DairyItem(2,"icecream",50,2);
		DairyItem i4=new DairyItem(3,"Milk",20,4);
		Costem  i5=new Costem (6,"Scent",20,5);
		DairyItem i6=new DairyItem(4,"Curd",30,6);
		Costem i7=new Costem (7,"soap",100,2);
		DairyItem i8=new DairyItem(8,"icecream",50,7);
		DairyItem i9=new DairyItem(9,"Milk",20,8);
		Costem  i10=new Costem (10,"Scent",20,9);
		
		Costem  i11=new Costem (11,"Scent",20,11);
		DairyItem i12=new DairyItem(12,"Curd",30,12);
		Costem i13=new Costem (13,"soap",100,13);
		DairyItem i14=new DairyItem(14,"icecream",50,14);
		DairyItem i15=new DairyItem(15,"Milk",20,15);
		
		DairyItem i16=new DairyItem(16,"Milk",20,16);
		Costem  i17=new Costem (17,"Scent",20,17);
		DairyItem i18=new DairyItem(18,"Curd",30,18);
		Costem i19=new Costem (19,"soap",100,19);
		
		o1.additem(i1);
		o1.additem(i2);
		o1.additem(i3);
		o1.additem(i4);
		o1.additem(i5);
		o1.additem(i6);
		
		o2.additem(i8);
		o2.additem(i9);
		o2.additem(i10);
		
		o3.additem(i11);
		o3.additem(i12);
		o3.additem(i13);
		o3.additem(i14);
		o3.additem(i15);
		
		o4.additem(i16);
		o4.additem(i17);
		o4.additem(i18);
		o4.additem(i19);
		
	    
		
		DeleteOrder do1=new DeleteOrder();
		do1.setItemlist(o1.Itemlist);
		do1.setCustomer(o1.getCustomer());
		
		SessionFactory sessionfFactory=new Configuration().configure().buildSessionFactory();
		Session session =sessionfFactory.openSession();
		session.beginTransaction();
		//adding Customer
		session.save(c1);
		System.out.println("Added Customer");
		System.out.println(c1);
		
		//adding Customer
				session.save(c2);
				System.out.println("Added Customer");
				System.out.println(c1);
		System.out.println();
		//Adding Items
		session.save(i1);
		System.out.println("Added item");
		System.out.println(i1);
		System.out.println();
		session.save(i2);
		System.out.println("Added item");
		System.out.println(i2);
		System.out.println();
		
		session.save(i3);
		System.out.println("Added item");
		System.out.println(i3);
		System.out.println();
		session.save(i4);
		
		System.out.println("Added item");
		System.out.println(i4);
		System.out.println();
		
		session.save(i5);
		System.out.println("Added item");
		System.out.println(i5);
		System.out.println();
		
		session.save(i6);
		System.out.println("Added item");
		System.out.println(i6);
		System.out.println();
		
		session.save(i7);
		
		System.out.println("Added item");
		System.out.println(i7);
		System.out.println();
		session.save(i8);
		System.out.println("Added item");
		System.out.println(i8);
		System.out.println();
		
		session.save(i9);
		
		System.out.println("Added item");
		System.out.println(i9);
		System.out.println();
		
		session.save(i10);
		System.out.println("Added item");
		System.out.println(i10);
		System.out.println();
		
		session.save(i11);
		System.out.println("Added item");
		System.out.println(i11);
		System.out.println();
		
		session.save(i12);
		System.out.println("Added item");
		System.out.println(i12);
		System.out.println();
		
		session.save(i13);
		System.out.println("Added item");
		System.out.println(i13);
		System.out.println();
		
		session.save(i14);
		System.out.println("Added item");
		System.out.println(i14);
		System.out.println();
		
		session.save(i15);
		System.out.println("Added item");
		System.out.println(i15);
		System.out.println();
		
		session.save(i16);
		System.out.println("Added item");
		System.out.println(i16);
		System.out.println();
		
		session.save(i17);
		System.out.println("Added item");
		System.out.println(i17);
		System.out.println();
		
		session.save(i18);
		System.out.println("Added item");
		System.out.println(i18);
		System.out.println();
		
		session.save(i19);
		System.out.println("Added item");
		System.out.println(i19);
		System.out.println();
		
		
		//adding Order
		session.save(o1);
		System.out.println("OrderAdd "+o1.getId());
		session.save(o2);
		System.out.println("OrderAdd "+o2.getId());
		
		session.save(o3);
		System.out.println("OrderAdd "+o3.getId());
		
		session.save(o4);
		System.out.println("OrderAdd "+o4.getId());
		
		//Deleting Order
		//save detail in deleted order and remove from add order
		session.save(do1);
		session.delete(o1);
		System.out.println("OrderDelete "+do1.getId());
		
		
		//update Customer;
		
		c1.setName("Ara");
		session.update(c1);
		
		List<CustomerDetails>  cd=session.createQuery("from CustomerDetails ").list();
		for(CustomerDetails c :cd)
			System.out.println(c);
		
		
		TypedQuery query = session.getNamedQuery("ProductById");    
        query.setParameter("id",1); 
        
        List<Product> product=query.getResultList();
        for(Product p :product)
        	System.out.println(p);
        
		product=session.getNamedQuery("AllProducts").getResultList();
		 for(Product p :product)
	        	System.out.println(p);
		 List<OrderAdd> Order=session.getNamedNativeQuery("OrderFor").getResultList();
		 for(OrderAdd o:Order)
		 {
			
			 product=o.Itemlist;
			 for(Product p :product)
		        	System.out.println(p);
			 System.out.println("__________________________________________________________________");
		 }
		 
		 
		session.getTransaction().commit();
		
		
		
		session.close();
		
		
	}

	private static Object createQuery(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
