import java.util.*;

public class _2_costOfitem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of pencile item ");
        float pencile=sc.nextFloat();

        System.out.println("Enter the cost of pen item ");
        float pen=sc.nextFloat();

        System.out.println("Enter the cost of eraser item ");
        float eraser=sc.nextFloat();

        float total_cost=(pencile+pen+eraser);

        System.out.println("Total cost of your item is: "+total_cost +" without GST. ");

        float total_cost_GST=(float)(total_cost+(18*((total_cost)/100)));

        System.out.println("\n Total cost of your item after GST is: "+total_cost_GST );

    }
}