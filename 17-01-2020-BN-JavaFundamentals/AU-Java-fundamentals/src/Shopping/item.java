package Shopping;
//Item is Used instead of product
public class item {
	 private int id;
	 private String name;
	 private int price;
	 private int available;
	 public void setdata(int i, int p,String n,int a)
	 {
		 this.id=i;
		 this.name=n;
		 this.price=p;
		 if(a>0)
		 {
			 this.available=a;
		 }
		 else available=0;
		 
	 }
	 public int getid()
	 {
		 return this.id;
	 }
	 public int getprice()
	 {
		 return this.price;
	 }
	 public String getname()
	 {
		 return this.name;
	 }
	 public int getavail()
	 {
		 return this.available;
	 }
	 public void getincrease(int q)
	 {
		  this.available+=q;
	 }
	 public void getreduce(int q)
	 {
		  this.available-=q;
	 }
	 
	 public void display() {
		 System.out.printf("%4d %16s %5d %5d\n",this.id,this.name,this.price,this.available);
		 
	 }
}
