public class BugFix{
 private int Bid;
  private String Bname;

  public BugFix(){
    this.Bid=0;
    this.Bname="";  }
  
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

public BugFix(int bid, String bname) {
    this.Bid = bid;
    this.Bname = bname;
}

public static void main(String[]args){
 BugFix b=new BugFix();

  b.setBid(1);
  b.setBname("Shreyash");
  System.out.println(b.getBid());
  System.out.println(b.getBname());
  }}
