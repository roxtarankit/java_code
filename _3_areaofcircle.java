import java.util.*;

public class areaofcircle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        float pi=3.14f;
        
        //area of circle
        //pi*r*r

        System.out.println("Enter the radius of Circle: ");
        int radius=sc.nextInt();

        double area=(pi*radius*radius);

        System.out.println(area);
    }
}