
package ass.student;

import javax.security.auth.Subject;

public class Student {
   public String name ;
    private int StudentID;
    public  double StudentGPA;
     private static int Numberofobject=0;
   
   Subject subject;
   Address address ;
    public Student() {
        Numberofobject++;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }
    public Student(String name, int StudentID, double StudentGPA) {
        this.name = name;
        this.StudentID = StudentID;
        this.StudentGPA = StudentGPA;
         Numberofobject++;
    }
     
    
   
    public void display()
    {
        System.out.println("the student name" + name + " the StudentID " +  StudentID +" the StudentGPA " + StudentGPA );  
    }
   @Override
     public String toString ()
       {
           return name + " student ";
       }

    public static int getNumberofobject()
    {
        return Numberofobject;
    }
}
