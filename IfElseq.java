// prepare Grade sheet by using IF ELSE use following details
  // Score greater than 90 and less than or equal to 100 A+
// Score greater than 80 and less than or equal 90 A
// Score greater than 70 and less than or equal 80 B+
// Score Greater than 60 and less than or equal 50 B
// Like Wise the person who gets less than 36 is considered as Grade F
// Variables should use

import java.util.Scanner;

public class IfElseq{
  public int score=60;
  public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the marks secured: ");
    int marks=scan.nextInt();
    if(marks>=90){
      System.out.print("Grade: A+");
    }
    else if(marks>=80 ){
      System.out.print("Grade: A");
    }
    else if(marks>=70 ){
      System.out.println("Grade: B+");
    }
    else if(marks>=60 ){
      System.out.println("Grade: B");
    } 
    else if(marks>=50 ){
      System.out.println("Grade: C");
    }
    else if(marks>=40 ){
      System.out.println("Grade: D");
    }
    else if(marks>=36){
      System.out.println("Grade: E");
    }
    else
        System.out.println("Grade: F");
IfElseq f=new IfElseq();
   // Complete the Reamaining Logic using score variable for a value
}
}
