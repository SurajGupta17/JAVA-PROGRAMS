/*Write a program that reads an integer and displays all its smallest factors in increasing order. For example if input number is 120, the output should 
be as follows:2,2,2,3,5.*/


import java.util.Scanner;
public class prac_14 {
    public static void main(String[] args) {
        int div = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer= ");
        int num = sc.nextInt();
        sc.close();
        while(div>1){
            if(num%div==0){
                System.out.print(div+",");
                num=num/div;
            }
            else
            div++;
            
        }
    }
    
}
