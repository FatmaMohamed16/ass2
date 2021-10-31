/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person.ass;

/**
 *
 * @author NoteBook
 */
public class Student extends person {
    
    final String Status1= "freshman";
    final String Status2= "sophomore";
    final String Status3= "junior";
    final String Status4= "senior";
     public Student(String n,String a, String numb , String email)
     {
         super(n, a, numb, email);
     }
    @Override
     public String toString()
     {
         return name + "  Student  ";
     }
    @Override
     public void display()
     {
         super.display();
         System.out.println("the status1 is "+ Status1 + " the Status2 is " + Status2);
//         System.out.println(" the status1 is  " + Status1," the status2 is " +Status2 );
     }
    
}
