package Market;

import java.util.Random;

public class Farmer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r=new Random();
		int fruits[]=new int[4];
		int fruits1[]=new int[4];
		fruits1[0]=fruits[0]=r.nextInt(10);
		fruits1[1]=fruits[1]=r.nextInt(10);
		fruits1[2]=fruits[2]=r.nextInt(20);
		fruits1[3]=fruits[3]=r.nextInt(5);
		

		synchronized (Market.map) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean wait=false;
			do {
				
				wait=false;
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<fruits1[i];j++) {
						if(Market.map.get(Market.f_name[i]).size()<Market.cap.get(Market.f_name[i]))
						{
							if((fruits[i]>0))
							{
								Market.map.get(Market.f_name[i]).add(i);
								fruits[i]--;
								System.out.println("Farmer "+Thread.currentThread().getName()+" added "+(j+1)+" of "+((fruits1[i]))+ " "+Market.f_name[i]);
								Market.map.notifyAll();
							}
							
						}
						else {
							System.out.println("Farmer "+Thread.currentThread().getName()+" waiting to add "+(fruits[i])+" "+ Market.f_name[i]);

							wait=true;
							break;
							
						}
					}
					
				}
				if(wait)
				{
					System.out.println("Farmer "+Thread.currentThread().getName()+" is waiting ");
					try {
						Market.map.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}while((fruits[0]>0)||(fruits[1]>0)||(fruits[2]>0)||(fruits[3]>0));
//			for(int i=0;i<4;i++)
//			{
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				if()
//				switch ((i+1))
//				
//				{
//				
//				case 1:for(int j=0;j<fruits[i];j++)
//				{
//					
//					if(Market.map.get("apple").size()<=Market.cap.get("apple"))
//					{
//						Market.map.get("apple").add(i);
//						System.out.println("Farmer "+Thread.currentThread().getName()+" added "+(j+1)+" of "+((fruits[i]+1))+" apples");
//						Market.map.notifyAll();
//					}else {
//						try {
//							System.out.println("Farmer "+Thread.currentThread().getName()+" is waiting to add apples");
//							Market.map.wait();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				}break;
//				case 2:for(int j=0;j<fruits[i];j++)
//				{
//					
//					if(Market.map.get("mango").size()<=Market.cap.get("mango"))
//					{
//						Market.map.get("mango").add(i);
//						System.out.println("Farmer "+Thread.currentThread().getName()+" added "+(j+1)+" of "+((fruits[i]+1))+" mangoes");
//						Market.map.notifyAll();
//					}else {
//						try {
//							System.out.println("Farmer "+Thread.currentThread().getName()+" is waiting to add mangoes");
//							Market.map.wait();
//							
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				}break;	
//				case 3:for(int j=0;j<fruits[i];j++)
//				{
//					
//					if(Market.map.get("grapes").size()<=Market.cap.get("grapes"))
//					{
//						Market.map.get("grapes").add(i);
//						System.out.println("Farmer "+Thread.currentThread().getName()+" added "+(j+1)+" of "+((fruits[i]+1))+" grapes");
//						Market.map.notifyAll();
//					}else {
//						try {
//							System.out.println("Farmer "+Thread.currentThread().getName()+" is waiting to add grapes");
//							Market.map.wait();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				}break;
//				case 4:for(int j=0;j<fruits[i];j++)
//				{
//					
//					if(Market.map.get("watermelon").size()<=Market.cap.get("watermelon"))
//					{
//						Market.map.get("watermelon").add(i);
//						System.out.println("Farmer "+Thread.currentThread().getName()+" added "+(j+1)+" of "+((fruits[i]+1))+" watermelon");
//						Market.map.notifyAll();
//					}else {
//						try {
//							System.out.println("Farmer "+Thread.currentThread().getName()+" is waiting to add watermelons");
//							Market.map.wait();
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//				}break;
//					
//				}
//				
//
//			}
			
		}
		
		
	}

}
