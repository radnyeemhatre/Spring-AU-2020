package Market;

import java.util.Random;

public class Consumer implements Runnable {

	@Override
	public void run() {
		Random r=new Random();
		//int cons=r.nextInt(5);
		int pick[]=new int[4];
		int pick1[]=new int[4];
		for(int i=0;i<4;i++)
		{
			
			pick1[i]=pick[i]=r.nextInt(5);
		}
		
		synchronized (Market.map) {
			boolean wait=false;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			do {
				
				
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<pick1[i];j++) {
						if(Market.map.get(Market.f_name[i]).size()>0)
						{
							if(pick[i]>0)
							{
								Market.map.get(Market.f_name[i]).remove(0);
								pick[i]--;
								System.out.println("Cosumer "+Thread.currentThread().getName()+" took "+Market.f_name[i]);
								Market.map.notifyAll();
							}
							
						}
						else {
							wait=true;
							System.out.println("cosumer "+Thread.currentThread().getName()+" is waiting for "+(pick[i])+" "+Market.f_name[i]);
							break;
						}
					}
					
				}
				if(wait)
				{
					System.out.println("cosumer "+Thread.currentThread().getName()+" is waiting ");
					try {
						Market.map.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				wait=false;
			}while((pick[0]>0)||(pick[1]>0)||(pick[2]>0)||(pick[3]>0));
		// TODO Auto-generated method stub
		

		
		
		}
	}
	
}
