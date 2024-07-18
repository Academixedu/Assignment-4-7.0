public class Test{
public static void main(String[]args){
// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
    Person person1 =new Person("kavitha","eluru");
    person1.setAge(21);
    person1.setSal(30000);

    
    System.out.println("name is "+person1.getname());
    System.out.println("Address is "+person1.getaddress());
    System.out.println("age is "+person1.getAge());
    System.out.println("salary is "+person1.getSal());
    

    
}
}
