package Market;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;


public class Market {
	//public static List<Integer> fruits=new LinkedList<>();
	static LinkedHashMap<String, List<Integer>> map =new LinkedHashMap<>();
	static LinkedHashMap<String, Integer> cap=new LinkedHashMap<>();
	static String f_name[]= {"apple","mango","grapes","watermelon"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cap.put("apple", 10);
		cap.put("mango", 10);
		cap.put("grapes", 20);
		cap.put("watermelon", 5);
		map.put("apple", new LinkedList<Integer>());
		map.put("mango", new LinkedList<Integer>());
		map.put("grapes", new LinkedList<Integer>());
		map.put("watermelon", new LinkedList<Integer>());
		System.out.println("Market");
		int k=0;
		int l=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				new Thread(new Farmer(),String.valueOf(k)).start();
				k++;
				
			}
			for(int j=0;j<3;j++)
			{
				new Thread(new Consumer(),String.valueOf(l)).start();
				l++;
			}
			
			
		}
		
	}

}
