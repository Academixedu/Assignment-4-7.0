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

public BugFix() {
    this.Bid = Bid;
    this.Bname = Bname;
}

public static void main(String[]args){
 BugFix b=new BugFix();
 String change=" "; 
  b.setBid(1);
  b.setBname("MANI");
  System.out.println(b.getBid());
  System.out.println(b.getBname());
  }}
