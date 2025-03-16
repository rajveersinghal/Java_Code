import java.util.*;
//BASE CLASS
class Student
{
   int Rollno; String Name;
   Scanner s=new Scanner(System.in);

   void getdata()
   {
    System.out.println("Enter Roll no:");
    Rollno=s.nextInt();
    System.out.println("Enter Name:");
    Name=s.next();
   }
   void display()
   {
    System.out.println("Roll no is = " +Rollno);
    System.out.println("Name is = " +Name);
   }

}
//DERIVED CLASS
class Marks extends Student
{
    int s1,s2;
    void data1()
    {  getdata();
        System.out.println("Enter marks of sub1");
        s1=s.nextInt();
        System.out.println("Enter marks of sub2");
        s2=s.nextInt();
    }
     void display1()
     {  display();
        System.out.println("Marks of sub1 = " +s1);
        System.out.println("Marks of sub1 = " +s2);
     }
}

//MAIN CLASS

public class SingleInheritance {
    public static void main(String[] aargs)
    {
         Marks m=new Marks();
         m.data1();
         m.display1();
    }
    
}

