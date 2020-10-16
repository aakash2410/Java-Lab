import java.util.Scanner;

class staff{

    String code;
    String name;

    public staff(String c, String n)
    {
        code=c;
        name=n;
    }

    public void setCode(String c)
    {
        code = c;
    }

    public String getCode()
    {
        return code;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

}

class teacher extends staff
{
    String subject;
    int experience;
    String code;

    public teacher(String c, String n)
    {
        super(c,n);
    }

    public teacher(String c, String n, String sub, int exp)
    {
        super(c, n);
        subject = sub;
        experience = exp;
    }

    public void setCode(String s)
    {
        super.setCode(s);
    }

    public void setSubject(String s)
    {
        subject = s;
    }

    public String getSubject()
    {
        return subject;
    }
    
    public void setExperience(int exp)
    {
        experience = exp;
    }

    public int getExperience()
    {
        return experience;
    }

}

class typist extends staff
{
    int speed;
    int experience;

    public typist(String c, String n, int s, int e)
    {
        super(c,n);
        speed = s;
        experience =e;
    }

    public void setSpeed(int s)
    {
        speed = s;
    }

    public int getSpeed()
    {
        return speed;
    }
    
    public void setExperience(int e)
    {
        experience = e;
    }

    public int getExperience()
    {
        return experience;
    }
}

class regular extends typist
{
    int salary;
    public regular(String c, String n, int s, int e,int sa)
    {
        super(c,n,s,e);
        salary = sa;
    }

    public void setSalary(int sa)
    {
        salary = sa;
    }

    public int getSalary()
    {
        return salary;
    }
}

class casual extends typist
{
    int daily_wages;
    public casual(String c, String n, int s, int e, int d)
    {
        super(c,n,s,e);
        daily_wages=d;
    }

    public void setDailywages(int d)
    {
        daily_wages = d;
    }

    public int getDailywages()
    {
        return daily_wages;
    }
}

class officer extends staff
{
    int grade;
    String dept;

    public officer(String c, String n, int g, String d)
    {
        super(c,n);
        grade = g;
        dept = d;
    }

    public void setGrade(int g)
    {
        grade = g;
    }

    public void setDept(String d)
    {
        dept = d;
    }

    public int getGrade()
    {
        return grade;
    }

    public String getDept()
    {
        return dept;
    }
}

public class exp7{

    public static void main(String args[])
    {
        int choice=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Choose option from below to input data in the database \n");
        while(choice!=0)
        {
            System.out.println("\n\nChoose Your Choice...");
            System.out.println("1) Teacher Details");
            System.out.println("2) Typist Details ");
            System.out.println("3) Officer Details");
            System.out.println("Press 0 (ZERO) to exit ");
            System.out.print("Enter your choice :  ");
            choice = s.nextInt();

            if (choice == 0)
            {
                System.out.println("Thanks for visiting the database.");
                System.exit(1);
            }

            

            switch(choice)
            {
                case 1:
                System.out.print("Enter the teachers code: ");
                String teacher_code = s.next();
                System.out.print("Enter the teachers name: ");
                String teacher_name = s.next();
                System.out.print("Enter the teachers subject: ");
                String sub = s.next();
                System.out.print("Enter the teachers experience in years: ");
                int teacher_exp = s.nextInt();
                System.out.println("\n=====TEACHER DETAILS=====");
                teacher t = new teacher(teacher_code, teacher_name, sub, teacher_exp);
                System.out.println("Teachers Name:"+ t.getName());
                System.out.println("Teachers Code:"+ t.getCode());
                System.out.println("Teachers Subject:"+ t.getSubject());
                System.out.println("Teachers Experience:"+ t.getExperience());
                break;

                case 2:
                System.out.print("Enter the typists code: ");
                String ty_code = s.next();
                System.out.print("Enter the typists name: ");
                String ty_name = s.next();
                System.out.print("Enter the typists speed: ");
                int speed = s.nextInt();
                System.out.print("Enter the typists Experience: ");
                int ty_exp = s.nextInt();
                System.out.println("Enter the typists type, \nEnter choice \n1.) Regular \n2.) Casual ");
                int choice1 = s.nextInt();
                switch(choice1)
                {
                    case 1:
                    System.out.println("Enter the typists salary: ");
                    int sal = s.nextInt();
                    System.out.println("\n=====REGULAR TYPIST DETAILS=====\n");
                    regular re = new regular(ty_code, ty_name, speed, ty_exp, sal);
                    System.out.println("Regular typists Name:"+ re.getName());
                    System.out.println("Regular typists Code:"+ re.getCode());
                    System.out.println("Regular typists speed:"+ re.getSpeed());
                    System.out.println("Regular typists experience:"+ re.getExperience());
                    System.out.println("regular typists salary:"+ re.getSalary());
                    break;

                    case 2:
                    System.out.println("Enter the typists daily wages: ");
                    int wage = s.nextInt();
                    System.out.println("\n=====CASUAL TYPIST DETAILS=====\n");
                    casual dw = new casual(ty_code, ty_name, speed, ty_exp, wage);
                    System.out.println("Casual typists Name:"+ dw.getName());
                    System.out.println("Casual typists Code:"+ dw.getCode());
                    System.out.println("Casual typists speed:"+ dw.getSpeed());
                    System.out.println("Casual typists experience:"+ dw.getExperience());
                    System.out.println("Casual typists wages:"+ dw.getDailywages());
                    break;
                }
                break;

                case 3:
                System.out.print("Enter the officers code: ");
                String off_code = s.next();
                System.out.print("Enter the officers name: ");
                String off_name = s.next();
                System.out.println("Enter the officers grade: ");
                int grade = s.nextInt();
                System.out.println("Enter the officers Department: ");
                String dept = s.next();
                System.out.println("\n=====OFFICER DETAILS=====\n");
                officer o = new officer(off_code, off_name, grade, dept);
                System.out.println("Officers Name:"+ o.getName());
                System.out.println("Officers Code:"+ o.getCode());
                System.out.println("Officers grade:"+ o.getGrade());
                System.out.println("Officers Department:"+ o.getDept());
                break;

            }
        }

    }

}