
import java.util.*;

public class PracticalExam {
    public static void main(String args[])
    {
        int flag = 1, x = 0;                    //flag to determine pangram, x is just used for index
        Boolean[] boolArray = new Boolean[26]; 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence to check below: ");   //input string
        String str = sc.nextLine().trim();
        String str_lower = str.toLowerCase();                    //all lowercase to avoid extra conditions
        Arrays.fill(boolArray, false);              //filling the array with default value as false although its already all false
        for (int i = 0; i< str_lower.length(); i++)       //iterating through the now lowercase string 
        {
            x = str_lower.charAt(i) - 'a';
            if (x >= 0 && x <= 25)                         //to make sure index is not out of bounds i.e. for spaces
            {
                boolArray[x] = true;                        //if its present then corresponding index will be true
            }
        }
        for (int i = 0; i<26; i++ )
        {
            if(boolArray[i] == false)
            {
                flag = 0;                                   //To check if all letters are present. 
                break;
            }
        }

        if(flag == 1)
        { 
            System.out.println("The following statement is a pangram \n" + str);
        }

        else{
            System.out.println("The following statement is NOT a pangram \n" + str + "\nThe letters missing are:");
            for(int i = 0; i<26; i++)
            {
                if(boolArray[i] == false)
                {
                    System.out.println((char)(i + 65));       //typecasting used to print missing letters
                }
            }
        }

    }
}
