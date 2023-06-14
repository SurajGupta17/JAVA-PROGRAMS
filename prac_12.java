import java.util.Random;
public class prac_12 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 65+(int)(Math.random()*(90-65));
        int b = 65+(int)(Math.random()*(90-65));
        int c = 65+(int)(Math.random()*(90-65));

        int d = (int)(Math.random()*10);
        int e = (int)(Math.random()*10);
        int f = (int)(Math.random()*10);
        int g = (int)(Math.random()*10);
        
        System.out.print("Number Plate :- "+(char)(a)+(char)(b)+(char)(c)+(int)(d)+(int)(e)+(int)(f)+(int)(g));
    }
}
