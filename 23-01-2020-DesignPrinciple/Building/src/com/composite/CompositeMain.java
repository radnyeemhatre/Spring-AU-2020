package com.composite;

public class CompositeMain {
	public static void main(String args[])
	{
		Component rockBase=new Leaf("RockBase");
		Component pillar=new Leaf("Pillars");
		Component lift=new Leaf("Lift");
		Component wall=new Leaf("wall");
		Component ceiling=new Leaf("Ceiling");
		Component floor=new Leaf("Room Floor");
		Component window=new Leaf("Window");
		Component door=new Leaf("Door");
		Component step=new Leaf("Step");
		Component sink=new Leaf("Sink");
		Component tap=new Leaf("tap");
		Component platform=new Leaf("Platform");
		Component showerSet=new Leaf("ShowerSet");
		Component gyser=new Leaf("Gyser");
		Component Toilet=new Leaf("Toilet");
		
		Component foundation=new Composite("Foundation");
		((Composite) foundation).addComponent(rockBase,1);
		((Composite) foundation).addComponent(pillar,15);
		
		
		Component stair=new Composite("Stairs");
		((Composite) stair).addComponent(step,20);
		
		Component corridor=new Composite("Corridor");
		((Composite) corridor).addComponent(wall,2);
		((Composite) corridor).addComponent(ceiling,1);
		((Composite) corridor).addComponent(floor,1);
		
		Component room=new Composite("Room");
		((Composite) room).addComponent(wall,4);
		((Composite) room).addComponent(ceiling,1);
		((Composite) room).addComponent(floor,1);
		((Composite) room).addComponent(door,1);
		((Composite) room).addComponent(window,2);

		Component kitchen=new Composite("Kitchen");
		((Composite) kitchen).addComponent(wall,4);
		((Composite) kitchen).addComponent(ceiling,1);
		((Composite) kitchen).addComponent(floor,1);
		((Composite) kitchen).addComponent(door,1);
		((Composite) kitchen).addComponent(window,1);
		((Composite) kitchen).addComponent(tap,1);
		((Composite) kitchen).addComponent(sink,1);
		((Composite) kitchen).addComponent(platform,1);
		
		Component bathroom=new Composite("Bathroom");
		((Composite) bathroom).addComponent(wall,4);
		((Composite) bathroom).addComponent(ceiling,1);
		((Composite) bathroom).addComponent(floor,1);
		((Composite) bathroom).addComponent(door,1);
		((Composite) bathroom).addComponent(showerSet,1);
		((Composite) bathroom).addComponent(tap,1);
		((Composite) bathroom).addComponent(sink,1);
		((Composite) bathroom).addComponent(gyser,1);
		((Composite) bathroom).addComponent(Toilet,1);
		
		Component flat=new Composite("Flat");
		((Composite) flat).addComponent(room,2);
		((Composite) flat).addComponent(kitchen,1);
		((Composite) flat).addComponent(bathroom,1);
		
		Component Floor=new Composite("Building Floor");
		((Composite) Floor).addComponent(flat,6);
		((Composite) Floor).addComponent(corridor,1);
		
		Component Building=new Composite("Building");
		((Composite) Building).addComponent(foundation,1);
		((Composite) Building).addComponent(Floor,6);
		((Composite) Building).addComponent(lift,2);
		((Composite) Building).addComponent(stair,14);
		
		Building.showDetails();



		
	}
	
}
