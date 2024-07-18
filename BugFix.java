public  class BugFix{

 private int Eid;
 private String Ename;
  
public int getEid() {
    return Eid;
}

public void setEid(int eid) {
    this.Eid = eid;
}

public String getEname() {
    return Ename;
}

public void setEname(String ename) {
    this.Ename = ename;
}

public  BugFix(int eid, String ename) {
    this.Eid = eid;
    this.Ename = ename;
}

public static void main(String[]args){
    BugFix b =new BugFix(12,"sarvesh");
 String change="passed the paremeter in constrctor "; 
 b.setEid(1);
  b.setEname("sarvseh");
 


  System.out.println(b.getEid());
  System.out.println(b.getEname());
  }
}


