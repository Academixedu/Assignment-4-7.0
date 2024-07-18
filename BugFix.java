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

public BugFix() {
    this.Bid = Bid;
    this.Bname = Bname;
}

public static void main(String[]args){
 BugFix b = new BugFix();
 String change="provide id,name";
  b.setBid(14);
  b.setBname("kavitha");
  System.out.println(b.getBid());
  System.out.println(b.getBname());
  }
}
