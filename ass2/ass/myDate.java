/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person.ass;

/**
 *
 * @author NoteBook
 */
import java.util.Date;
public class myDate {
     private Date datecreated;

    public myDate() {
        datecreated = new java.util.Date(); 
    }
    public String getDateCreated() {
        return datecreated.toString();
    }

    
}
