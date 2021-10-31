/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package person.ass;

/**
 *
 * @author NoteBook
 */
public class PersonAss {

    public static void main(String[] args) {
       person p=new person("fatma","minia","2133326","Kamelfatma@gmail.com");
       System.out.println(p.toString());
       p.display();
       
       Student s=new Student("omnia","egypt","878557","omniakamel@gmail.com");
       System.out.println(s.toString());
       s.display();
       Employee e = new Employee("ali","egypt","46355","alimohamed@gmail.com"," offic 102", 20000);
        System.out.println(e.toString());
        
        faculty f = new faculty("ali","egypt","46355","alimohamed@gmail.com"," offic 102", 20000,14.50,"doctor");
         System.out.println(f.toString());
        
         Staff st= new Staff("software Team"," hager", "damaress", "786832","hagerali@gmail.com", "room 2", 5000);
         System.out.println(st.toString());
         
         myDate date= new myDate();
         System.out.println(date.getDateCreated());
                 
       
    }
    
}
