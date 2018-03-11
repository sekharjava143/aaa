package StaticEX;

public class College {
	static int count=0;
   College()
   {
	   count++;
	   System.out.println(count);
   }
   public static void main(String[] args) {
	   College c1=new College();
	  College c2=new College(); 
	//  College c3=new College();
}
}

