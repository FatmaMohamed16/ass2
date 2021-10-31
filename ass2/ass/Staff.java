/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person.ass;

/**
 *
 * @author NoteBook
 */
public class Staff extends Employee {
    public String title ;

    public Staff(String T, String n, String a, String num, String email, String o, double s) {
        super(n, a, num, email, o, s);
        title = T;
    }

    @Override
    public String toString() {
       return name +" staff ";
    }

    
   
    
    
}
