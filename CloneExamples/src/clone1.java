
public class clone1 implements Cloneable 
{
	 int i=10;
	 int j=20;
	

	public static void main(String[] args) throws CloneNotSupportedException
	{
       clone1 c=new clone1();
       System.out.println(c.i+" "+c.j);
       clone1 c2=(clone1)c.clone();
      c2.i=100;
      c2.j=200;
      //System.out.println( c2.i +" "+c2.j);
      System.out.println(c.i+" "+c.j);
	}

}
