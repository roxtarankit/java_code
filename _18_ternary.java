import java.util.*;

public class _18_ternary{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your num: ");
        int num=sc.nextInt();

       String result=(num%2==0)?"Even":"Odd";
       System.out.println(result);
    }
}