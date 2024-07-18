public class BugFix{
 private int Bid;
  private String Bname;
  
  public int getBid() {
    return Bid;
}

public void setBid(int bid) {
    Bid = bid;
}

public String getBname() {
    return Bname;
}

public void setBname(String bname) {
    Bname = bname;
}

public BugFix(int bid,String bname) {
    this.Bid = bid;
    this.Bname = bname;
}

public static void main(String[]args){
 BugFix b=new BugFix(1,"BugName");
 String change="Updated"; 
  b.setBid(1);
  b.setBname("Updated BugName");
  System.out.println(b.getBid());
  System.out.println(b.getBname());
  System.out.println(change);
  
  }}
