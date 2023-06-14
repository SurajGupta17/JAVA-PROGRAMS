import java.util.Scanner;
class employee{

    int age;
    int salary;
    String name;

    public void setDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of employee:-");
        name = sc.nextLine();
        System.out.print("Enter the age of employee:-");
        age = sc.nextInt();
        System.out.print("Enter the salary of employee:-");
        salary = sc.nextInt();
        sc.close();
    }
    public void getDetail(){
        System.out.println("Name of the employee:- "+name);
        System.out.println("Age of the employee:- "+age);
        System.out.println("Salary of the employee:- "+salary);
    }

}
public class prac_21 {
    public static void main(String[] args) {
        employee e = new employee();

        e.setDetail();
        e.getDetail();

    }
    
}
