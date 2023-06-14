import java.util.Arrays;
import java.util.Scanner;

public class prac_18 {
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);                 // simple method to sort 
        System.out.println("Enter the size of array= ");
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in array= ");
        for(int i=0;i<n;i++){                                           
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close(); */

       /*  int n = Integer.parseInt(args[0]);
        int [] arr= new int[n];

        System.out.println("Enter element on the array =");

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(args[i+1]);
        }

        Arrays.sort(arr);

        System.out.println("Sorted element= ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ") */;

            int n=Integer.parseInt(args[0]);                //size of array
        int[] num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=Integer.parseInt(args[i+1]);
        }
        Arrays.sort(num);
        System.out.print("Sorted array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        
        }

    }
    
}
