import java.util.Scanner;

class Fraction{
    private int num;
    private int den;

    Fraction(int n, int d){
        num = n;
        den = d;
    }

    public long gcm(long a,long b){
        if(b==0){
            return a;
        }
        else{
            return gcm(b,a%b);
        }
    }

    public String toString(){
        long g = gcm(num,den);
        return num/g+"/"+den/g;
    }
    
}
public class prac_13 {

    public static void main(String[] args) {
        
    java.util.Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number= ");
    String str = sc.nextLine();
    int index = str.indexOf(".");
    int len = str.substring(index).length();
    int den = (int)Math.pow(10,len-1);
    int num = (int)(Double.parseDouble(str)*den);
    Fraction fr = new Fraction(num,den);
    sc.close();
    System.out.println("In Fraction = "+fr);

    }
    
    
}
