public class Person{
  private String name;
  private int age;
  private String address;
  private int phno;

  public Person(String name,int age, String address,int phno){
    this.name=name;
    this.age=age;
    this.address=address;
    this.phno=phno;
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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getPhno() {
    return phno;
  }

  public void setPhno(int phno) {
    this.phno = phno;
  }
 
}