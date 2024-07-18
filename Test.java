public class Test{
  public int id;
  public String name;
  public Test(int id,String name)
  {
        this.id=id;
        this.name=name;
  }
  public void setId(int id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  
public static void main(String[]args){
  Test person=new Test(1,"pas");
  System.out.println("id1="+person.getId());
  System.out.println("name1="+person.getName());
  Test p2=new Test(2,"raj");
  p2.setId(12);
  p2.setName("gas");
  System.out.println("id2="+p2.getId());
  System.out.println("name2="+p2.getName());
// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
}
}
