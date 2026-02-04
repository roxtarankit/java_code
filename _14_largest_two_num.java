import java.util.*;

public class _14_largest_two_num{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the Second number: ");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println("The largest number is: "+num1);
        }
        else
        {
            System.out.println("The largest number is: "+num2);
        }
    }
}