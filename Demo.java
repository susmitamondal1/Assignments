import java.util.Scanner;
class Grader{
int score; 
Grader(){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the score ");
score=scan.nextInt();

}
void letterGrade(){
 if(score >=90 ){
  System.out.println("the letter grade is : O");}
  else if(score>=81 && score<=90)
  {
    System.out.println("the letter grade is : E");
  }
  else if(score >=71 && score<=80)
  {
    System.out.println("the letter grade is : A");
  }
  else if(score >=61 && score<=70)
  {
    System.out.println("the letter grade is : B");
  }
  else if(score >=31 && score<=60)
  {
    System.out.println("the letter grade is : C");
  }
  else if(score<=30){
    System.out.println("the letter grade is : F");
  }
 }

}
 public class Demo{
   public static void main(String args[]){
    Grader g= new Grader();
    g.letterGrade();

   }
}