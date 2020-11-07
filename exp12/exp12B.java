import java.util.*;

class exp12B{
    static int n;
    static int arr[];
    static int sum1=0;
    static int max1=0;
    static int min1=0;
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of inputs: ");
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a value");
            arr[i]=sc.nextInt();
        }
        min1=arr[0];
        max m=new max();
        avg a=new avg();
        min x=new min();
        Thread t1=new Thread(m);
        Thread t2=new Thread(a);
        Thread t3=new Thread(x);
        t2.start();
        t1.start();
        t3.start();
        if(t1.isAlive()||t2.isAlive()||t3.isAlive())
        try{
            Thread.sleep(1000);
        }
        catch(Exception ex){}
        System.out.println("Average Value is: "+sum1/n);
        System.out.println("Minimum Value is: "+min1);
        System.out.println("Maximum Value is: "+max1);
    }
}

class max extends exp12B implements Runnable
{
    public void run()
    {
        for(int i=0;i<n;i++)   
        {
            if(arr[i]>max1)
                max1=arr[i];
        }
    }
}


class min extends exp12B implements Runnable
{ 
    public void run()
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=min1) 
                min1=arr[i];
        }
    }
}

class avg extends exp12B implements Runnable
{ 
    public void run()
    {
        for(int i=0;i<n;i++)
        {
            sum1=sum1+arr[i];
        }
    } 
}
