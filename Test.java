public class Test{
public static void main(String[]args){
// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
  Person p1=new Person("sai",23,634567,2);
System.out.println("details of person");
System.out.println("-------------------");
System.out.println("name is: "+p1.getName());
System.out.println("age is: "+p1.getAge());
System.out.println("phno is: "+p1.getPhno());
System.out.println("id is: "+p1.getId());

Person p2 = new Person("",0,0,0);
  p2.setName("sai");
  p2.setAge(23);
  p2.setPhno(7547778);
  p2.setId(5);
  System.out.println("details of person");
  System.out.println("----------------");
  System.out.println("name is: "+p2.getName());
  System.out.println("age is: "+p2.getAge());
  System.out.println("phno is:"+p2.getPhno());
  System.out.println("id is: "+p2.getId());


}

}
