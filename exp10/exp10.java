import java.util.*;

class student
{
    String name;
    int sap;
    Scanner sc = new Scanner(System.in);
    void read()
    {
        System.out.println("\nEnter name:");
        name=sc.next();
        System.out.println("\nEnter roll no.:");
        sap=sc.nextInt();
    }
}
class Test extends student
{
    static double sem1_marks;
    static double sem2_marks;
    void read()
    {
        super.read();
        System.out.println("\nEnter sem1 marks:");
        sem1_marks=sc.nextDouble();
        System.out.println("\nEnter sem2 marks:");
        sem2_marks=sc.nextDouble();
    }
}
class Result extends Test implements sports
{
    static double sp;
    public void read()
    {
        super.read();
        System.out.println("\nEnter sports score : ");
        sp=sc.nextDouble();
    }
    void display()
    {
        System.out.println("Name: "+ name+"\nRoll no.: "+sap);
        System.out.println("Total is :"+ " "+ (sem1_marks+sem2_marks+sp));
    }
    public static void main(String[] args) 
    {
        Result res=new Result();
        res.read();
        res.display();
    }
}
interface sports 
{
    void read();    
}