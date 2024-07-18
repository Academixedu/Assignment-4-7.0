public class Person{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
  public String name;
  public int age;
  private  String job;
  private int Sal;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
        
        
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


    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSal() {
        return Sal;
    }

    public void setSal(int Sal) {
        this.Sal = Sal;
    }

    public static void main(String[] args) {
        Person p = new Person("MANI", 18);
      
        p.setSal(50000);
        p.setJob("Developer");
        
        System.out.println("Name is "+p.getName());
        System.out.println("Age is "+p.getAge());
        System.out.println("Salary is "+p.getSal());
        System.out.println("Designation is "+p.getJob());

    }

  
}
