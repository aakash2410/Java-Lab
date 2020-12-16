import java.util.*;

public class exp14 {

	public static void main(String[] args) {

		volume(9.9);
		surface(9.9);

	}
	
	public static <T extends Number> void volume(T t)
	{
		double a=((4*Math.PI * Math.pow(t.doubleValue(), 3) )/3);
		System.out.println("VOLUME IS: "+a);
	}

	public static <P extends Number> void surface(P p)
	{
		double a=(4*Math.PI * Math.pow(p.doubleValue(), 2) );
		System.out.println("SURFACE IS: "+a);
	}
}
