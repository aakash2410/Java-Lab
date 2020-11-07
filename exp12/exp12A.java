import java.util.*;
import java.lang.*;

class fiveTable extends Thread
{
    public void run()
    {
        long startTime=System.currentTimeMillis();      //take current time to start a stopwatch
        for(int i=0;i<=10;i++)
        { 
            System.out.println("5*"+i+"="+(5*i));
        }
        long stopTime=System.currentTimeMillis();      //take current time to stop the stopwatch
        long elapsedTime=stopTime-startTime;            //measure the amount of time this took.
        System.out.println("Five time:"+elapsedTime); 
    }
}

class sevenTable extends Thread
{
    public void run()
    {
        long startTime=System.currentTimeMillis();
        for(int i=0;i<=10;i++)
        {
            System.out.println("7*"+i+"="+(7*i));
        }
        long stopTime=System.currentTimeMillis();
        long elapsedTime=stopTime-startTime;
        System.out.println("Seven time:"+elapsedTime); 
    }
}

class thirteenTable extends Thread
{
    public void run()
    {
        long startTime=System.currentTimeMillis();
        for(int i=0;i<=10;i++)
        {
            System.out.println("13*"+i+"="+(13*i));
        }
        long stopTime=System.currentTimeMillis();
        long elapsedTime=stopTime-startTime; 
        System.out.println("Thirteen time:"+elapsedTime); 
    }
}

class exp12A
{
    public static void main(String[] args)
    {
        long startTime=System.currentTimeMillis(); 
        fiveTable f=new fiveTable();
        sevenTable s=new sevenTable();
        thirteenTable th=new thirteenTable();
        f.start();
        s.start(); 
        th.start();
        long stopTime=System.currentTimeMillis();
        long elapsedTime=stopTime-startTime;
        System.out.println("Main time:"+elapsedTime);
    }
}