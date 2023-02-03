import java.util.Scanner;
public class Calculator {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Name-SUSMITA MONDAL,Roll no-54,Program Name- Write a Java program to convert Temperature from Fahrenheit to Celsius and vice versa.");
        
        System.out.println("enter the number 1 for Fahrenheit to Celsius and 2 for Celsius to Fahrenheit");
        int result = scan.nextInt();
        //System.out.print(result);
        if (result==1)
        {
            System.out.println("you are selecting Fahrenheit to Celsius conversion ");
            System.out.println("Enter the fahrenheit value ");
            double f=scan.nextDouble();
            double c=((f-32) * 5)/9; 
            System.out.println("The converted celsius value is  " + c);
        }
        else if(result==2)
        {
            System.out.println("you are selecting  Celsius to Fahrenheit  conversion");
            System.out.println("Enter the Celsius value ");
            double c=scan.nextDouble();
            double f=(((c * 9)/5) + 32);
            System.out.println("The converted Fahrenheit value is  " + f);
        }
        else 
    {
        System.out.println("not a valid number");
    }    }
}
