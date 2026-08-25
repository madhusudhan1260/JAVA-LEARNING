import java.util.*;

public class student
{
    String name;
    int rollno;
    String dept;

    void displayinfo()
    {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollno);
        System.out.println("Department: " + dept);
    }

    public static void main(String args[])
    {
        student s1 = new student();

        s1.name = "Madhusudhan";
        s1.rollno = 1260;
        s1.dept = "BTech CSE";

        s1.displayinfo();
    }
}