import java.util.Scanner;
class third
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter length in metre= ");
	double metre = sc.nextDouble();
	double feet = metre*(3.281);
	System.out.println("Length in feet = "+feet);
	}
}
