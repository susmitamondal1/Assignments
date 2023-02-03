import java.util.Scanner;
public class Reverse{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Name-susmita,roll no-54,Program Name- Write a java program to reverse a number entered as a command line argument");
        System.out.println("Enter a number");
        int number=scan.nextInt();
        int reverse = 0;
        while(number>0)
        {
           int remainder = number % 10;
           reverse = (reverse * 10) + remainder;
           number = number/10;
           //System.out.println("The reverse number is " + reverse);
        }
        System.out.println("The reverse number is " + reverse);
    }
} 