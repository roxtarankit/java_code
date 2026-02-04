import java.util.*;

public class _19_calculator{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter your first number: ");
    int num1=sc.nextInt();
    System.out.println("Enter your Second number: ");
    int num2=sc.nextInt();
    System.out.println("Enter your Operation: ");
    char ch=sc.next().charAt(0);

    switch(ch){
        case '+': System.out.println(num1+num2);
        break;
        case '-':System.out.println(num1-num2);
        break;
        case '*':System.out.println(num1*num2);
        break;
        case '/':System.out.println(num1/num2);
        break;
        case '%':System.out.println(num1%num2);
        break;
        default:
        System.out.println("Error");
    }
    }
}