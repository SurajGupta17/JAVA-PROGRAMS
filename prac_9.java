import java.util.Scanner;
public class prac_9 {
    public static void main(String[] args) {
        String str,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String= ");
        str =sc.nextLine();

        int l = str.length();

        for(int i=l-1;i>=0;i--){
            rev = rev +str.charAt(i);
        }

        System.out.println("Reverse String is = "+rev);

        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("String/Number is Palindrome...");
        }
        else{
            System.out.println("String/Number is not Palindrome...");
        }

    }
}
