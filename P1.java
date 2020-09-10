class add 
{
	public static void main(String ar[] ) {
	    int sum = 0;
		for(int i=0; i<ar.length; i++)
		{
		    sum = sum + Integer.parseInt(ar[i]);
		}
		System.out.println(sum);
	}
}

