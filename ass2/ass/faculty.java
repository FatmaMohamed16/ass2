/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person.ass;

/**
 *
 * @author NoteBook
 */
public class faculty extends Employee {
    public double workHour;
    public String Rank;
    public faculty(String n, String a , String num, String email , String o, double s, double h, String R)
    {
        super(n, a, num, a, o, s);
        workHour=h;
        Rank=R;
        
    }
     public String toString()
     {
         return name + " faculty";
     }
    
}
