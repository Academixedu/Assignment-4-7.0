public class Test{
  public int id;
  public String name;
  public Test(int id,String name){
    this.id=id;
    this.name=name;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  
public void setId(int id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
public static void main(String[]args){


  
// Create Object for Person
Test person=new Test(12,"Pavani");
System.out.println("id is"+person.getId());
System.out.println("name is"+person.getName());
Test person2 =new Test(1,"ganesh");
person2.setId(12);
person2.setName("gani");
System.out.println("id 1 is"+person2.getId());
System.out.println("name 2 is"+person2.getName());

  // Initialize values with Constructors



  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
}

}