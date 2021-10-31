/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person.ass;

/**
 *
 * @author NoteBook
 */
public class person {
    public String name;
    public String address;
    public String number;
    public String e_mailAddress;
    public person()
    {
    }
    
    public person(String name,String address,String number, String e_mailAddress)
    {
        this.name= name;
        this.number= number;
        this.address=address;
        this.e_mailAddress= e_mailAddress;
    }
    @Override
     public String toString()
     {
         return name +"  person ";
     }
     public void display()
     {
         System.out.println("the name of person is " + name + " the address is " + address + " the phone number is "+ number + " the emailAddress is " + e_mailAddress) ;
     }
}
