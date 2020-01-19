package Triconsumer;


public class TriMain {
	private void triconsumer(Integer a, Integer b, Integer c,Triconsumer<Integer,Integer,Integer> consumer) {	
		
		consumer.consume(a, b, c);
		System.out.println("Performs an Static Action");
	}
	public static void main(String args[]) {
		
		TriMain mainClass = new TriMain();
		
		Triconsumer<Integer,Integer,Integer> consume1=(a,b,c)->
		System.out.println(":ans: "+(a+b+c));
		consume1.consume(10,20,30);
		
		mainClass.triconsumer(10, 12, 17, (a,b,c)->System.out.println((a+b+c)));
		
	}
}