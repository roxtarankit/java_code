import java.util.*;

public class _17_tax_cal{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Salary: ");
        int income=sc.nextInt();

        if(income>1000000)
        {
            System.out.println("Your Income Tax is charged at 30% and it is: "+30*(income/100));
        }
        else if(income>=500000 && income<=1000000)
        {
            System.out.println("Your Income Tax is charged at 20% and it is: "+20*(income/100));
        }
        else{
            System.out.println("Your Income Tax is: 0 ");
        }
    }
}