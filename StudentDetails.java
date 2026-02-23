public class StudentDetails  {
    
}
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        String studentName;
        int studentAge;
        double studentGrade;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        studentName = input.nextLine();
        System.out.print("Enter your age: ");
        studentAge = input.nextInt();
        System.out.print("Enter your grade: ");
        studentGrade = input.nextDouble();

        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Grade: " + studentGrade);
    }
}
