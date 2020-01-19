package Exception_lambda;

import java.util.function.BiConsumer;

public class lambdaexception {
	public static void main(String args[])
	{
		int a[]= {3,4,0,2,1};
		int key=15;
		process(a,key , wrapperLambda((i,k)->System.out.println(k/i)));
		
		
	}
	public static void process(int a[],int key,BiConsumer<Integer, Integer> c)
	{
		for(int i:a)
		{
			c.accept(i, key);
		}
	}
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> c)
	{
		return (v,k)->{
			try {
				c.accept(v, k);
		}catch(ArithmeticException e)
		{
			System.out.println("Wrapper Catch");		
		}
	};
	}
}
