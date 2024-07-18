public class IfElse{
  public int score=60;
  public static void main(String[]args){
IfElse f=new IfElse();
int sc=f.score;
System.out.println("Score is: "+sc);
   if (sc>90 && sc<=100){
    System.out.println("The grade for score " + sc + " is A+");
   }
   else if (sc>80 && sc<=90){
    System.out.println("The grade for score " + sc + " is A");
   }
   else if (sc>70 && sc<=80){
    System.out.println("The grade for score " + sc + " is B+");
   }
   else if (sc>60 && sc<=70){
    System.out.println("The grade for score " + sc + " is B");
   }
   else if (sc>50 && sc<=60){
    System.out.println("The grade for score " + sc + " is C");
   }
   else if (sc>40 && sc<=50){
    System.out.println("The grade for score " + sc + " is D");
   }
   else if (sc>=36 && sc<=40){
    System.out.println("The grade for score " + sc + " is E");
   }
   else if (sc<36){
    System.out.println("The grade for score " + sc + " is F");
   }
   else{
    System.out.println("Invalid Score");
   }
}
}
