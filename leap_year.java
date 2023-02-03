import java.util.Scanner;
public class leap_year {
public static void main(String args[]){
    System.out.println("Name-SUSMITA MONDAL,Roll no-54,Program Name- Write a Java Program to check whether a given year is a leap year.");
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the year");
    int year = scan.nextInt();
    if(((year % 4 == 0) && (year % 100 != 0)) ||
    (year % 400 == 0)){
    System.out.println("year is leap year");
    }
    else {
        System.out.println("year is not leap year");  
    
}
}   
}
