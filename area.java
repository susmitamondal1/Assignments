import java.util.Scanner;
public class area {
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Name-SUSMITA MONDAL,Roll no-54,Program Name- Write a java Program to find the area and Perimeter of a rectangle");
        System.out.println("Enter the number 1 for Calculate the area of a rectangle and 2 for  Perimeter");
        int result= scan.nextInt();
        if(result == 1)
        
        {
            System.out.println("calculate the area of rectangle ");
            System.out.println("enter the length of a rectangle");
            double l=scan.nextDouble();
            System.out.println("enter the wigth of a rectangle ");
            double w=scan.nextDouble();
            double area=(l*w);
            System.out.println("the area of a rectangle is " + area);
        }
        else if(result==2)
        {
            System.out.println("calculate the Perimeter of rectangle ");
            System.out.println("enter the length of a rectangle");
            double l=scan.nextDouble();
            System.out.println("enter the wigth of a rectangle ");
            double w=scan.nextDouble();
            double Perimeter=(2*l +2*w);
            System.out.println("the Perimeter of a rectangle is " + Perimeter);
        }
        else{
            System.out.println("invalid number");
        }
    }
    
}
