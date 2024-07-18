public class Test 
{
public static void main(String[]args)
{
// Create Object for Person
  // Initialize values with Constructors
  // print the values
  // Create another Object for Person
  // Assign Values with Getters & Setters
  // print the values
  
  Person sh=new Person(100,"Shreyash", 200,"Arghode" );
   
  //System.out.println(sh.getid());
   // System.out.println(sh.getname);
   // System.out.println(sh.eid);
   //System.out.println(sh.ename);
   sh.setId(200);
   sh.setName("Shreyash Avinash");
   sh.seteid(300);
   sh.setename("Arghode 1");
   System.out.println(sh.getId());
   System.out.println(sh.getName());
   System.out.println(sh.geteid());
   System.out.println(sh.getename());


   
}



}
