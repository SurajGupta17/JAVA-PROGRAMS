/*Write a method with following method header.public static int gcd(int num1, int num2)Write a program that prompts the user to enter two integers and compute the gcd of two integers*/


import java.util.Scanner;
public class prac_15 {
    public static int gcd(int num1,int num2){
        int b,l=0;
        if(num1 > num2 || num1 == num2){
            b = num1;
        }
        else{
            b = num2;
        }
        for(int i = 1;i <= b; i++){
            if(num1 % i == 0 && num2 % i==0){
                l = i;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1= ");
        int m = sc.nextInt();
        System.out.print("Enter the number 1= ");
        int n = sc.nextInt();
        sc.close();
        int result = gcd(m, n);

        System.out.println("Greatest common factor = "+result);

    }
    
}
