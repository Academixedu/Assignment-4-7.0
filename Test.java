public class Test{
public static void main(String[]args){
// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
  Person p1=new Person("Mani", 18);
  System.out.println("Name is "+p1.getName());
  System.out.println("age is "+p1.getAge());


  Person p2 = new Person("Subrahmanyam",21);

  p2.setSal(100000);
  p2.setJob("Sr.Developer");
  System.out.println("name is "+p2.getName());
  System.out.println("age is "+p2.getAge());
  System.out.println("salary is "+p2.getSal());
  System.out.println("job is "+p2.getJob());

}

}
