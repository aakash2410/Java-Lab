import java.util.*;
class add 
{
	public static void main(String ar[] ) {
		StringBuffer s = new StringBuffer();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String");
		s.append(input.nextLine());
		StringBuffer s2 = s.reverse();
		System.out.println(s2.equals(s));
		System.out.println(s2);
	}
}

