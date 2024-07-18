public class Person{
 // Take 4 fields
  public int id;
  public String name;
  private int age;
  public int sal;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public int getSal() {
    return sal;
  }
  public void setSal(int sal) {
    this.sal = sal;
  }

  //Create Getters and Setters
  
  // Implement Constructor argumented
  public Person(int id,String name,int age,int sal){
    this.id=id;
    this.name=name;
    this.age=age;
    this.sal=sal;
  }
  // Include private


  public static void main(String[]args){
    Person p=new Person(12,"Pavani",22,20000);
    System.out.println("id is"+p.getId());
    System.out.println("name is"+p.getName());
    System.out.println("age is"+p.getAge());
    System.out.println("sal is"+p.getSal());
  }
    



  
}