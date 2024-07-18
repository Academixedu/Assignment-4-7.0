// prepare Grade sheet by using IF ELSE use following details
  // Score greater than 90 and less than or equal to 100 A+
// Score greater than 80 and less than or equal 90 A
// Score greater than 70 and less than or equal 80 B+
// Score Greater than 60 and less than or equal 50 B
// Like Wise the person who gets less than 36 is considered as Grade F
// Variables should use
public class IfElse{
  public int score=60;
  
  
  public static void main(String[]args){
IfElse f=new IfElse();
   // Complete the Reamaining Logic using score variable for a value

   if(f.score>90 && f.score<=100){
    System.out.println("A+");
    }
    else if(f.score>80 && f.score<=90){
      System.out.println("A");
  
    }
    else if(f.score>70 && f.score<=80){
      System.out.println("B+");
  
    }
    else if(f.score>60 && f.score<=50){
      System.out.println("B");
  
    }
    else if(f.score>50 && f.score <=60)
   {
  
    System.out.println("C");}
  
    else if (f.score < 36){
  
  
      System.out.println("FAIL");
  
    }
    else{
      System.out.println("INVALID SCORE");
    }
   
}
}
