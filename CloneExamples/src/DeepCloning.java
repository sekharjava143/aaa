
class Abc
{
	int j;
	Abc(int j)
	{
		//sj
		this.j=j;
	}
}
	class Xyz  implements Cloneable
	{
		Abc a;
	    int i;
		Xyz(Abc a,int i)
		{
			this.a=a;
			this.i=i;
		}
		public Object clone() throws CloneNotSupportedException 
		{
			Abc a1=new Abc(a.j);
			Xyz x=new Xyz(a1,i);
			return x;
			
		}
	}	
    public class DeepCloning 
    {

  	public static void main(String[] args) throws CloneNotSupportedException
  	{
       Abc a=new Abc(10);
       Xyz x=new Xyz(a,20);
       System.out.println(x.i+"==="+x.a.j);
       Xyz xx=(Xyz)x.clone();
       xx.i=100;
       xx.a.j=200;
       System.out.println(x.i+"==="+x.a.j);
	}

}
