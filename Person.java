 public class Person{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
  public int eid;
 public String ename;
  private double sal;
  private String edesg;

  public String getename(){
    return ename;
  } 
  public int geteid(){
    return eid;
  }
  public void seteid(int id){
    this.eid=id;
  }
  public double getsal(){
    return sal;
  }
  public String getdesg(){
    return edesg;
  }
  public void setdesg(String desg){
    this.edesg=desg;
  }
  public void setsal(double sal){
    this.sal=sal;
  }
  public Person(int id,String ename,double sal,String edesg){
    this.eid=id;
    this.ename=ename;
    this.sal=sal;
    this.edesg=edesg;

  }
  public static void main(String[]args)
   {
    Person obj =new Person(1,"sri",30000,"Java Developer");
    System.out.println(obj.getename());
    System.out.println(obj.geteid());
    obj.seteid(4);
    System.out.println(obj.geteid());
    System.out.println(obj.getsal());
    obj.setsal(50000);
    System.out.println(obj.getsal());
    System.out.println(obj.getdesg());
    obj.setdesg("MainFrame Developer");
    System.out.println(obj.getdesg());


  }



}
