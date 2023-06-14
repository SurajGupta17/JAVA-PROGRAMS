import java.util.Scanner;

import javax.xml.transform.Source;

public class prac_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows= ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns= ");
        int cols = sc.nextInt();

        /* System.out.println("Enter the number of rows for matrice2= ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of columns for matrice2= ");
        int cols1 = sc.nextInt(); */

        int [][] matrice1 = new int [rows][cols];
        int [][] matrice2 = new int [rows][cols];
        int [][] sum = new int [rows][cols];

        System.out.println("Enter element in matrice1=");
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrice1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element in matrice2=");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrice2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrice1:-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            System.out.print(matrice1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrice2:-");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            System.out.print(matrice2[i][j]+" ");
            }
            System.out.println();
        }

       /*  System.out.println("Addition of matrice1 and matrice2= ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int sum = matrice1[i][j]+matrice2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        } */
        System.out.println("Addition of two matrices:- ");
        for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
            sum[i][j]=matrice1[i][j]+matrice2[i][j];
            System.out.print(sum[i][j]+" ");
           }
           System.out.println();
        }
    
    }
}
