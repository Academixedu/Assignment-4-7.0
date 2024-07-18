public class BugFix{
 private int Bid;
  private String Bname;
  
  public int getBid() {
    return Bid;
}

public void setBid(int bid) {
    this.Bid = bid;
}

public String getBname() {
    return Bname;
}

public void setBname(String bname) {
    this.Bname = bname;
}

public BugFix(int bid, String bname) {
    this.Bid = bid;
    this.Bname = bname;
}

public static void main(String[]args){
 BugFix b=new BugFix(22,"pavani");
 String change="set ";
 System.out.println("change is"+change); 
  b.setBid(22);
  b.setBname("pavani");
  System.out.println(b.getBid());
  System.out.println(b.getBname());
  }}
