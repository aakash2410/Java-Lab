public class exp14B {
	public static void main(String[] args) {
		
         int a=2;
         int b=3;
         compare(a,b);
         
         String a1="aakash";
         String b1="aakash";
         compare(a1,b1);


	}
	
	public static <T extends Comparable<T>> void compare(T t1,T t2)
	{
		int res1 = t1.compareTo(t2);
        if(res1==-1)
        {
       	 System.out.println(t2+" is greater than "+t1);
        }
        else if(res1==1)
        {
       	 System.out.println(t1+" is greater than "+t2);
        }
        else
        {
       	 System.out.println(t1+" is equal to "+t2);
        }
	}
}
