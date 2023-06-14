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
