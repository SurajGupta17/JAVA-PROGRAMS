/*Write a program that generate 6*6 two
-dimensional matrix, filled with 0’s and 1’s ,display the matrix, check every raw and column have an odd number’s of 1’s.*/



import java.util.Scanner;
import java.util.Random;

public class prac_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter number of Rows= ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns= ");
        int cols = sc.nextInt();
        
        int [][] arr= new int[rows][cols];
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                
                arr[i][j] = (int)((Math.random()*4)%2);//remainder se matlab hai
            
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                
                System.out.print(arr[i][j]+" ");;
            
            }
            System.out.println();
        }
        int zero = 0;
        for(int i=0;i<rows;i++){
            int one= 0;
            for(int j=0;j<cols;j++){
                if(arr[i][j]==1){
                    one++;
                }
               /*  else{
                    zero++;
                } */
            }
            if(one%2==0){
                System.out.println("row "+i+" has even number of 1's");
            }
            else{
                System.out.println("row "+i+" has odd number of 1's");
            }
        }
        
        for(int j=0;j<cols;j++){
            int one= 0;
            for(int i=0;i<rows;i++){
                if(arr[i][j]==1){
                    one++;
                }
               /*  else{
                    zero++;
                } */
            }
            if(one%2==0){
                System.out.println("Column "+j+" has even number of 1's");
            }
            else{
                System.out.println("Column "+j+" has odd number of 1's");
            }
        }
        
    }
}
