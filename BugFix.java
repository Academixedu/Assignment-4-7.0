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
 BugFix b=new BugFix(23,"gani");
 String change="use this in setter"; 
  b.setBid(1);
  b.setBname("raj");
  System.out.println(b.getBid());
  System.out.println(b.getBname());
  System.out.println(change);
  }}
