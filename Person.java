public class Person{
// Take 4 fields
  //Create Getters and Setters
  // Implement Constructor argumented
  // Include private
   public int Eid;
   private String Ename;
   public int Esal;
   private String Eadd;
             
   //CONSTRUCTOR
   public Person (int Eid , String Ename , int Esal , String Eadd){
   this.Eid=21;         
   this.Ename="Abhishek";
   this.Esal=12345;
   this.Eadd="pardi";}

    //Getter Setter

    public int getEid(){
      return Eid;
    }
    public void setEid(int Eid){
      this.Eid=Eid;
    }
    public String getEname(){
      return Ename;
    }
    public void setEname(String Ename){
      this.Ename=Ename;
    }
    public int getEsal(){
      return Esal;
    }
    public void  setEsal(int Esal){
      this.Esal=Esal;
    }
    public String getEadd(){
      return Eadd;
    }
    public void setEadd(String Eadd){
      this.Eadd=Eadd;
    }
  

   }
