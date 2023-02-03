import java.util.Scanner;
public class Count {
    public static void main(String args[])
    {
        System.out.println("Name-susmita,roll no-54,Program Name- Write a java Program to count the number of digits entered through the command line argument");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=scan.nextInt();
        int count =0;
        for(;number>0;number=number/10)
        {   
            count = count + 1;
        } 
        //while(number>0)
        // {
        //    number = number/10;
        //    count = count +1;
        //}
        System.out.println("The number of digit is " + count);
    }
}
