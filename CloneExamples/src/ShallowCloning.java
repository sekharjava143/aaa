 class Cat
{
	int j;
	Cat(int j)
	{
		this.j=j;
	}
}
	class Dog implements Cloneable
	{
	    Cat c;
		int i;
		Dog(Cat c,int i)
		{
			this.c=c;
			this.i=i;
		}
		public Object clone() throws CloneNotSupportedException
		{
			/*Cat cc=new Cat(c.j);
			Dog dd=new Dog(cc,i);
			return dd;*/
			
			return super.clone();
		}
	}
		 public class ShallowCloning 
		{
			 public static void main(String[] args) throws CloneNotSupportedException 
			 {
				Cat c=new Cat(20);
				Dog d1=new Dog(c,10);
				System.out.println(d1.i+" "+d1.c.j);
				Dog d2= (Dog)d1.clone();
				d2.i=888;
				d2.c.j=999;
				System.out.println(d1.i+"   "+d1.c.j);
				//System.out.println(d2.i+"   "+d2.c.j);	
			}
		}	
