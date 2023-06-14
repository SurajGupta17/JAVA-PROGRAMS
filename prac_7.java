import java.util.Scanner;

public class prac_7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String= ");
        String str = sc.nextLine();
        sc.close();
        int l = str.length();
        System.out.println("Length of the String= "+l);
        System.out.print("Second half of the String= "+str.substring(l/2));


        
    }
    
}
