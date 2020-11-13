import java.util.*;
import java.io.*;

class exp13
{
    public static void main(String args[]) 
    {
        Vector itemList = new Vector();
        String str,item;
        int i,j,len,choice,pos;
           
        len=args.length;
        for(i=0;i<len;i++)
        {
            itemList.addElement(args[i]);
        }  
          while(true)
          {
               System.out.println("\n\nChoose your choice ...");
               System.out.println("1) Delete  Item");
               System.out.println("2) Add Item at Specified Location ");
               System.out.println("3) Add Item at the End of the list");
               System.out.println("4) Print Vector List ");
               System.out.println("5) Exit");
               System.out.print("Enter your choice : ");
               try{
                   Scanner obj = new Scanner(System.in);
                   choice=obj.nextInt();
                   switch(choice)
                   {
                       case 1 :    System.out.print("Enter Item you want to delete : ");
                                        str=obj.next();
                                        itemList.removeElement(str);  //string is not needed to convert object type as it is already object of class String
                                        break;

                      case 2 :     System.out.print("Enter Item to be Insert : ");
                                        System.out.flush();
                                        item=obj.next();
                                        System.out.print("Enter Position to insert item : ");
                                        pos = obj.nextInt();
                                        itemList.insertElementAt(item,pos-1);
                                        break;

                      case 3 :     System.out.print("Enter Item to be Insert : ");
                                        System.out.flush();
                                        item=obj.next();
                                        itemList.addElement(item);
                                        break;

                     case 4 :      len=itemList.size();
                                        System.out.println("\nItem Display ");
                                        for(i=0;i<len;i++)
                                        {
                                               System.out.println((i+1)+") "+itemList.elementAt(i));
                                        }
                                        break;
                      case 5 :     System.out.println("\n\nExiting......... Thank You..........");
                                        System.exit(1);
                                        break;
                      default :     System.out.println("\nEntered Choice is Invalid\nTry Again\n");
                    }
                }
            catch(Exception e) {}
         }      
    }
}