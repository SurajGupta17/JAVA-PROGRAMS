/*Write a program of constructor overloading and make zero argument constructor to set a default values of student name, roll no and total marks.And make another constructor with all the three parameters and make use of ‘this’ keyword. Using methods, display values of both the constructors*/


class detailsOfStudent{
    int marks,rollno;
    String name;
    detailsOfStudent(){
        name = "Suraj";
        marks = 88;
        rollno = 171;
        System.out.println("Default Constructor....");
    }
    detailsOfStudent(int marks,int rollno,String name){
        this.marks = marks;
        this.rollno = rollno;
        this.name = name;
    }

    public void getInfo(){
        System.out.println("Name : "+name);
        System.out.println("Rollo. : "+rollno);
        System.out.println("Marks : "+marks);
    }

}
public class prac_22{

    public static void main(String[] args) {
        
        detailsOfStudent obj = new detailsOfStudent(67,181,"Kalpesh");
        detailsOfStudent obj1 = new detailsOfStudent();

        obj.getInfo();
        obj1.getInfo();

    }

}