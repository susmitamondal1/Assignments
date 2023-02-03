import java.util.Scanner;
public class Multiply {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Name-susmita,roll no-54,Program Name- Write a java program to find all the multiples of 3 within a given range where the starting and ending value are entered through command line argument ");
        System.out.println("Enter the starting number ");
        int s_number=scan.nextInt();
        System.out.println("Enter the ending number ");
        int e_number=scan.nextInt();
        for(int i=s_number;i<=e_number;i++)
        {
            int result=(3*s_number);
            s_number=s_number+1;
            System.out.println(i +" multiples by 3 = " + result);
        }
    }
}
