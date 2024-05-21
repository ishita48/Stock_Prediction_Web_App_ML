/**
   This class defines a person by name and address.
*/
public class Person
{
   // The person's last name
   private String lastName;
   // The person's first name
   private String firstName;
   // The person's address
   private Address home;
   /**
      Constructor
      @param last The person's last name.
      @param first The person's first name.
      @param residence The person's address.
*/
   public Person(String last, String first,
                 Address residence)
   {
      lastName = last;
      firstName = first;
      home = residence;
}
/**
      The toString method
      @return Information about the person.
*/
public String toString()
{
   return(firstName + " " + lastName +
          ", " + home.toString());
} 
}
