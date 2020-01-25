package com.composite;

import java.util.*;

public class Composite implements Component {

	String name;
	int Quantity;
	Map <Component,Integer> c=new HashMap();
	
	Composite(String name)
	{
		this.name=name;
		
		}
	
	public void addComponent(Component l,int quantity)
	{
		c.put(l,quantity);
	}
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		if(name.equals("Building"))
			System.out.print("Component "+this.name +" Contains  ---\n");
		else
		System.out.print("Component "+this.name +" Contains that ---\n");
		for(Map.Entry<Component, Integer> entry : c.entrySet())
		{
			Component k=entry.getKey();
			System.out.print(entry.getValue()+"  ");
			k.showDetails();
			System.out.println();
		}
			
		
		System.out.println("-----------------------------------");
		
	}
	
	

}
