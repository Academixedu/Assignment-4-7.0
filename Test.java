public class Test
{
    
      public static void main(String[]args)
   {
// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
 Person per=new Person("Ratan", 22, 80000  , "Java Developer");
  

  per.setPersonName("Shreyas");
  per.setpersonAge(22);
  per.setPersonSal(22300);
  per.setPersonDept("Dev");

  System.out.println("Person Name "+per.getPersonName() );
  System.out.println("person Age "+ per.getPersonAge());
  System.out.println("Person Sal "+ per.getPersonSal());
  System.out.println("Person Department "+per.getpersonDept());

   


}

}

