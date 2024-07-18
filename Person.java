public class Person
{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
  private int id;
  private String name;
  private int eid;
  private String ename;

  public Person(int id,String name,int eid,String ename)
  {
    this.id=10;
    this.name="Shreyash";
    this.eid=20;
    this.ename="Arghode";
  }
  


  public int getId() 
  {
    return id;
  }

  public void setId(int id)
   {
    this.id = id;
  }



  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }
 public int geteid() 
 {
    return eid;
 }
 public void seteid(int eid)
 {
    this.eid=eid;
 }
 public String getename()
 {
  return ename;

 }
 public void setename(String ename)
 {
  this.ename=ename;
 }
//  public static void main(String[] args) {
 // Person sh=new Person(100,"Shreyash", 200,"Arghode" );

//  System.out.println(sh.id);
  //System.out.println(sh.name);
  //System.out.println(sh.eid);
//System.out.println(sh.ename);

  

 //}






  
}
