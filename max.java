import java.util.Scanner;
public class max {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Name-SUSMITA MONDAL,Roll no-54,Program Name- Write a program in Java to find the maximum of three numbers");
        System.out.println("Enter the number 1st number");
        int f_num= scan.nextInt();
        System.out.println("Enter the second number");
        int s_num=scan.nextInt();
        System.out.println("Enter the third number");
        int t_num=scan.nextInt();
        if(f_num >= s_num && f_num >= t_num)
        {
            System.out.println("the max number is first number : " + f_num);
        }
        else if(s_num>=f_num && s_num>=t_num){
            System.out.println("the max number is second number : " + s_num);
        }
        else{
            System.out.println("the max number is third number : " + t_num);
        }
    } 
}
