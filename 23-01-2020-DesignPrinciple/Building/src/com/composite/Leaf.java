package com.composite;

public class Leaf implements Component{
	String name;

	
	public Leaf(String name)
	{
		this.name=name;
	}
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.print("Component " + name );
		
	}
	
	

}
