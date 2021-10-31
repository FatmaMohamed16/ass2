
package ass.student;

public class Subject {
    public  int subjecID;
    public String subjectName;
    public int SubjectHours;
     private static int Numberofobject=0;

    public Subject() {
        Numberofobject++;
    }

    public Subject(int subjecID, String subjectName, int SubjectHours) {
        this.subjecID = subjecID;
        this.subjectName = subjectName;
        this.SubjectHours = SubjectHours;
         Numberofobject++;
    }
    public void display()
    {
        System.out.println("the subjecID is" + subjecID + " the subjectName is  " + subjectName + "  SubjectHours ");
    }
     public String toString ()
       {
           return subjectName + " subject ";
       }
     
      public static int getNumberofobject()
    {
        return Numberofobject;
    }
}
