
package ass.student;

public class Address {
    public int Streatnumber;
    public String city ;
     public String country ;
      private static int Numberofobject=0;

    public Address() {
        Numberofobject++;
    }
    public Address(int Streatnumber, String city, String country) {
        this.Streatnumber = Streatnumber;
        this.city = city;
        this.country = country;
         Numberofobject++;
    } 
    
    public void display ()
    {
        System.out.println("the streatnumber is "+ Streatnumber + "  the city is " + city + " the country " + country);
    }
   
      public String toString ()
       {
           return city + " Address ";
       }
      public static int getNumberofobject()
    {
        return Numberofobject;
    }
}
