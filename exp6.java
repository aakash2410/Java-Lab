import java.util.Scanner;

public class exp6 
{ 

    void addStudent(int k) 

    { 

        student_exp6 arr[] = new student_exp6[k]; 

        Scanner ob = new Scanner(System.in); 

        for(int i=0;i<k;i++) 

        { 

            arr[i]=new student_exp6(); 

            System.out.println("Enter Id and Name and all three marks"); 

            arr[i].id=ob.nextInt(); 

            arr[i].s=ob.next(); 

            arr[i].m1=ob.nextInt(); 

            arr[i].m2=ob.nextInt(); 

            arr[i].m3=ob.nextInt(); 

            arr[i].tot=arr[i].m1+arr[i].m2+arr[i].m3; 

        } 

            arrange(arr); 

    } 

    void arrange( student_exp6 a[]) 

    { 

        int j=0,i=0; 

        student_exp6 tmp; 

        for (i=1;i<a.length;i++) 

        { 

            for(j=0;j<a.length-i;j++) 

            { 

                if (a[j].tot < a[j+1].tot) 

                { 

                    tmp = a [j]; 

                    a[j] = a[j+1]; 

                    a[j+1] = tmp; 

                } 

            } 

        } 

        display(a); 

    } 

    void display(student_exp6 a[]) 

    { 

        for(int i=0;i<a.length;i++) 

        { 

            System.out.println("name: "+a[i].s+" total marks= "+a[i].tot); 

        } 

    } 

    public static void main(String args[])

    { 

        Scanner ob=new Scanner(System.in); 

        System.out.println("Enter the number of students"); 

        int k=ob.nextInt(); 

        exp6 obj=new exp6(); 

        obj.addStudent(k); 

    } 

} 

class student_exp6 
{ 

    int id; 

    String s; 

    float m1,m2,m3,tot=0; 


} 