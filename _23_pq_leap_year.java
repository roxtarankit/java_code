import java.util.*;

public class _23_pq_leap_year{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Year: ");
        int year=sc.nextInt();

        if((year%4==0) && (year%100!=0))
        {
            System.out.println("Year is leap year");
        }
        else if((year%4==0)&&((year%400==0)&&(year%100==0))){
            System.out.println("Year is leap year");
        }
        else{
            System.out.println("Year is not a leap Year. ");
        }
    }
}