/* Write a program to count the number of words that start with 
capital letters */

import java.util.Scanner;
public class prac_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String= ");
        String str = sc.nextLine();
        sc.close();
        int ct= 0;
        char c;
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            if(c>=65&&c<=90){
                ct++;
            }
        }
        System.out.println("Number of capital letters in String= "+ct);
    }
}
