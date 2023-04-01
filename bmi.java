import java.util.Scanner;
class bmi
{
public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Your Weight in Pound= ");
	double po = sc.nextDouble();
	double kg=po*(0.4536);
	System.out.print("Enter Your Height in inches= ");
	double in = sc.nextDouble();
	double me = in*(0.0254);
	double b = kg/(me*me);
	System.out.print("Your Body Mass Index is= "+b);
	}
}