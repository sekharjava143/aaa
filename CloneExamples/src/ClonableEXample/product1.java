package ClonableEXample;


public class product1 implements Cloneable
{
	int price;
	String name;
	SmallP S;
	 product1(SmallP S,int price,String name)
	 {
		 this.S=S;
		 this.price=price;
		 this.name=name;
	 }
	 public product1 clone() throws CloneNotSupportedException
	 {
		/*SmallP ss=new SmallP(this.S.sp);
		product1 p=new product1(ss,this.price,this.name);
		 return p;*/
		 return (product1) super.clone();
	 }
	 public static void main(String[] args) throws CloneNotSupportedException 
	 {
		 SmallP ss=new SmallP(1);
		 product1 p= new product1(ss,100,"mango");
		System.out.println(p.price+"====="+p.name+"==="+p.S.sp);
		product1 ppp=(product1)p.clone();
		ppp.S.sp=110;
		System.out.println("duplicate==="+ppp.price+"====="+ppp.name+"==="+ppp.S.sp);
		System.out.println(p.price+"====="+p.name+"==="+p.S.sp);
			
		
	}
	

}
