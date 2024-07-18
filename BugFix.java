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
 BugFix b=new BugFix(2,"kumar");
 String change=" we have to add this keywords to setbid and setname methods,assign values in the object "; 
  b.setBid(1);
  b.setBname("syam");
  System.out.println(b.getBid());
  System.out.println(b.getBname());
  }}
