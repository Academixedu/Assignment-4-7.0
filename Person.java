public class Person{
// Take 4 fields
public String name;
public String sname;
private int age;
private int salary;

  //Create Getters and Setters
  public String getName(){
    return name;
  }
  public String getSname(){
    return sname;
  }
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getSalary(){
    return salary;
  }
  public void setSalary(int salary){
    this.salary = salary;
  } 
  // Implement Constructor argumented
  public Person(String name) {
    this.name = name;

  }
  
  // Include private
  public static void main(String[] args) {
    Person p = new Person("goutham");
    Person s = new Person("paladugu");
    p.setAge(21);
    p.setSalary(3000);
    System.out.println("name is :"+p.getName());
    System.out.println("surname is :"+s.getSname());
    System.out.println("age is :"+p.getAge());
    System.out.println("salary is :"+p.getSalary());


  }
}
