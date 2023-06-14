import java.util.Scanner;
public class prac_16 {
    static void reverse(int[] list){

        System.out.println("Reverse order of the array= ");
        
        for(int i=list.length-1;i>=0;i--){
            System.out.print(list[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[10];

        System.out.println("Enter 10 digits= ");

        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Straight order or elements= ");

        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        reverse(arr);
    }
    
}
