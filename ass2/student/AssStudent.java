
package ass.student;
public class AssStudent {

    
    public static void main(String[] args) {

        
        Student sd= new Student("Fatma", 30 , 2.7);
         System.out.println(sd.toString());
       sd.display();
        System.out.println("the number of objects created in this class is " + sd.getNumberofobject());
       
       System.out.println("////////////////////////");
      
        Address a =new Address(45, "minia", "egypt");
        System.out.println(a.toString());
       a.display();
       
        System.out.println("////////////////////////");
       
       
       Subject s= new Subject(101, "science", 3);
       System.out.println(s.toString());
       s.display();
        
       ///////// خلي بالك ناسيه ميثود   gpa
       
        }
    
}
