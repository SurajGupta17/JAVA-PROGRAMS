import java.util.Random;
public class prac_11 {
    public static void main(String[] args) {
        Random r =  new Random(100);

        for(int i=0;i<100;i++){
            System.out.print(" "+r.nextInt(49));

            if(i%10==0){
                System.out.println();
            }
        }
    }
}
