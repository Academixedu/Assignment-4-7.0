public class Test{
  // Take 4 fields
    //Create Getters and Setters
    // Implement Constructor argumented
    // Include private
    public int stuid;
   public String stuname;
    private int stufee;
    private String studept;
  
    public String getstuname(){
      return stuname;
    } 
    public int getstuid(){
      return stuid;
    }
    public void setstuid(int stuid){
      this.stuid=stuid;
    }
    public double getstufee(){
      return stufee;
    }
    public String getdept(){
      return studept;
    }
    public void setstudept(String studept){
      this.studept=studept;
    }
    public void setstuname(String stuname){
      this.stuname=stuname;
    }
    
    public Test(int stuid,String stuname,int stufee,String studept){
      this.stuid=stuid;
      this.stuname=stuname;
      this.stufee=stufee;
      this.studept=studept;
  
    }
    public static void main(String[]args)
     {
      Test obj =new Test(1,"sankeerthana",50000,"MPC");
      System.out.println(obj.getstuname());
      System.out.println(obj.getstuid());
      obj.setstuid(4);
      System.out.println(obj.getstuid());
      obj.setstuname("keerthana");
      System.out.println(obj.getstuname());
      
  
  
    }
  
  
  
  }
  