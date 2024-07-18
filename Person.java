public class Person{
// Take 4 fields
 private int id;
 public String name;
 public int salary;
 public double per;
  //Create Getters and Setters
public void setId(int id) {
    this.id = id;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }
  public void setPer(double per) {
    this.per = per;
  }
  public int getId()
{
    return id;
}
public String getName()
{
  return name;
}
public int getsalary()
{
  return salary;
}
public double getPer()
{
 return per;
}

  // Implement Constructor argumented
  public Person(int id,String name,int salary,double per)
  {
    this.id=id;
    this.name=name;
    this.salary=salary;
    this.per=per;

  }
  // Include private


public static void main(String args[])
{
  Person p1=new Person(1, "raju", 20000, 80);
  System.out.println("name"+p1.getId());
  System.out.println("name"+p1.getName());
  System.out.println("name"+p1.getsalary());
  System.out.println("name"+p1.getPer());
}

}