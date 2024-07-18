public class Test{
public static void main(String[]args){
// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
    Person person1 = new Person("sujatha","Hyderabad");
    System.out.println("name is:"+person1.getName());
    System.out.println("Address is:"+person1.getAddress());

    person1.setAge(21);
    person1.setId(12345);
    System.out.println("Ageis:"+person1.getAge());
    System.out.println("ID is:"+person1.getId());

  }
}