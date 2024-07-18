// prepare Grade sheet by using IF ELSE use following details
  // Score greater than 90 and less than or equal to 100 A+
// Score greater than 80 and less than or equal 90 A
// Score greater than 70 and less than or equal 80 B+
// Score Greater than 60 and less than or equal 50 B
// Like Wise the person who gets less than 36 is considered as Grade F
// Variables should use
public class IfElse
{
  public int score=60;

  public void  score()
  {
    if(score>90 && score<=100)
    {
     System.out.println("A+ grade");
    }
    else if (score>80 && score<=90)
    {
     System.out.println("A grade");
   }
   else if(score>70 && score<=80)
   { 
     System.out.println("B+ grade");
   }
   else if(score>60 &&  score<=70)
   {
    System.out.println("B grade");
    }
    else if (score>50 && score<=60)
    {
      System.out.println("C+ grade");
    }
    else if (score>50 && score<=36){
      System.out.println("c grade");
    }
    else 
    {
      System.out.println("F grade");
    }
  }
  
  public static void main(String[]args){
IfElse f=new IfElse();
f.score();
   // Complete the Reamaining Logic using score variable for a value
   
  
}
}

