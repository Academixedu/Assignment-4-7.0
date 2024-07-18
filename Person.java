public class Person{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
  private String name;
  private String address;
  private int age;
  private int sal;
  
   //constructor//
   public Person(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public String getname(){
        return name;
        
    }
    public String getaddress(){
        return address;
        
    }
    public Person(int age,int sal)
    {
        this.age=age;
        this.sal=sal;
    }
    public int getAge(){
        return age;
    }
    public int getSal(){
        return sal;
    }


    
}


