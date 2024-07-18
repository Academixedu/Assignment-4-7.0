import java.util.jar.Attributes.Name;

public class Person{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private

  public String Name;
  public int Age;
  private String Desgination;
  private int Salery;
  public String Address;


        public Person(String Name, int age, String Desgination, int Salery, String Address){
          this.Name = Name;
          this.Age = age;
          this.Desgination= Desgination;
          this.Salery = Salery;
          this.Address = Address;

        }

    public int getAge(){
      return Age;
    }

    public void setAge(){
      this.Age= Age;
    }

    public String getAddress(){
      return Address;
    }
    public void setAddress(){
      this.Address= Address;

    }

    public static void main(String[] args) {
      Person person = new Person("Ritesh", 22, "Sr. Devloper", 150000, "Berhampur, Odisha");

      System.out.println("Name: "+person.Name);
      System.out.println("age: "+person.Age);
      System.out.println("Desgination: "+person.Desgination);
      System.out.println("Salery: "+person.Salery);
      System.out.println("Address: "+person.Address);

    }

}
