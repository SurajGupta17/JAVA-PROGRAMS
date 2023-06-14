/*Write a program to implement the operation of stack using array*/

import java.util.Scanner;

class stack{
    /* Scanner s = new Scanner(System.in); */
    int top=-1,n=10;
    /* System.out.print("Enter the size of array= ")
    int n = s.nextInt(); */
    int[] arr= new int[n];
    
    void push(int val){
        if(top == (n-1)){
            System.out.println("Stack is Overflow!!!");
        }
        else{
            top = top+1;
            arr[top]=val;

        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is Underflow!!!");
        }
        else{
            top=top-1;
            System.out.println("Top element is popped ny default...");
        }
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is empty....");
        }
        else{
            System.out.println("Elements in stack:- ");
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }

}


public class prac_20 {   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
       /*  System.out.println("Enter the Size of the Stack= ");
        int size = sc.nextInt(); */
        //int[] stack= new int[size];
        stack s = new stack();

        System.out.println("Opertaions on Stack:- ");
        System.out.println("1-->Push\n2-->Pop\n3-->Display\n4-->Exit");

        /* System.out.print("Enter your choice= ");
            int choice = sc.nextInt(); */
        do{
            System.out.print("Enter your choice= ");
            choice = sc.nextInt();
           switch (choice)
            {
            case 1: System.out.println("Enter element to insert:- ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;
            
            case 2: s.pop();
                    break;
            
            case 3: s.display();
                    break;
            
            case 4: System.out.println("Exited....");
                    break;
            default:System.out.println("Invalid input....");
                    break;
            }

        }while(choice!=4);
        sc.close();
    }
    
}
