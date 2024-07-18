public class Test{
  public String course;
  public int fee;
  public Test(String course,int fee){
    this.course=course;
    this.fee=fee;
  }
  public String getcourse(){
    return course;
  }
  public int getfee(){
    return fee;
  }
  public void setfee(int feee){
    this.fee=feee;
  }
public static void main(String[]args){
Test t1=new Test("java fullstack", 30000);
Test t2=new Test("dotnet", 40000);
System.out.println("course:"+t1.getcourse());
System.out.println("fee:"+t2.getfee());
t1.setfee(60000);
System.out.println("update fee:"+t1.getfee());





// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values

}


}
