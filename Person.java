public class Person{
  //Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
  private String name;
  private int age;
  private int id;
  private String address;

  public Person(String name,String address){
    this.name = name;
    this.address = address;
  }
  public String getName(){
    return name;
  }
  public String getAddress(){
    return address;
  }
  public Person(int age,int id){
    this.age = age;
    this.id = id;
  }
  public int getAge(){
    return age;
  }
  public int getId(){
    return id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setId(int id) {
    this.id = id;
  }
  public void setAddress(String address) {
    this.address = address;
  }


}
