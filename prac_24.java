import java.util.Scanner;

class employee{
    String name;
    int age;
    int salary;
    int count = 0;

    /* employee(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary = salary; */
    // }

    public void set(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
    }

    public void display(){
        count = count+1;
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        System.out.println("Employee no. : "+count);
    }
}

class prac_24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int i;
        employee[] arr = new employee[10];

        for(i=0;i<10;i++){
            arr[i] = new employee(); 
            arr[i].set();
        }

        for(i=0;i<10;i++){
            arr[i].display();
        }

    }
}