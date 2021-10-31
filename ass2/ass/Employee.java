/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person.ass;



/**
 *
 * @author NoteBook
 */
public class Employee extends person {
    
    String office;
    double salary;
    public Employee()
    {  
    }
     public Employee(String n, String a , String num, String email , String o, double s)
     {
         super(n, a, num, email);
         office=o;
         salary = s;
     }
       public String toString ()
       {
           return name + " Employee ";
       }
       
}
