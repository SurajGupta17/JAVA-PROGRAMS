/*Write a program that defines a Circle class with two constructors. The first form accepts a double value that represents the radius of the circle. The second form accepts the integer radius of the circle and calculates the area of the circle.*/


import java.util.Scanner;
import java.lang.Math;
class circle{
    double area;
    double area1;

    circle(double r){
       area =  Math.PI*r*r;
       System.out.println("Area of circle(Double) : "+area);
    }
    circle(int r1){
        area1 = Math.PI*r1*r1;
        System.out.println("Area of circle(Integer): "+area1);
    }

}

public class prac_23{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius in double = ");
        double d = sc.nextDouble();
        System.out.println("Enter the radius in integer = ");
        int i = sc.nextInt();

        circle c  = new circle(d);
        circle c1  = new circle(i);

        sc.close();

        
    }
    
}