import java.util.*;

abstract class Book
{
   String title;
   abstract void setTitle(String s);
   String getTitle()
   {
      return title;
   }
   
}

//Write MyBook class here
 class MyBook extends Book
{
    void setTitle(String s)
    {
        title = s;
    }
    
}

public class exp9 
{
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter title of the book: \n");
      String title_in =sc.nextLine();
      MyBook new_book=new MyBook();
      new_book.setTitle(title_in);
      System.out.println("The title is: "+new_book.getTitle());
      
   }
}