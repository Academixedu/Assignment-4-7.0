public class Person1{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
   public int stuid;
   public String stuName;
   private int age;
   private String department;

   public String getstuName(){
    return stuName;
   }
   public int getstuid(){
    return stuid;
   }
   public int getage(){
    return age;
   }
   public String getdepartment(){
    return department;
   }
   public void setstuid(int id){
    this.stuid=id;
   }
   public void setstuName(String name){
    this.stuName=name;
   }
   public Person1(int stuid,String stuName,int age,String department){
    this.stuid=stuid;
    this.age=age;
    this.stuName=stuName;
    this.department=department;
   }
   public static void main(String args[]){
    Person1 stu1=new Person1(123,"syam",22,"ECE");
    Person1 stu2=new Person1(12,"kumar",23,"CSE");
    
    System.out.println("name:" +stu1.getstuName());
    System.out.println("student id:"+stu1.getstuid());
    System.out.println(" stu2 student age:" +stu2.getage());
    System.out.println("stu2 dept:" +stu2.getdepartment());

    stu1.setstuName("sri");
    System.out.println(stu1.getstuName());
    stu2.setstuid(345);
    System.out.println(stu2.getstuid());

   }
}

