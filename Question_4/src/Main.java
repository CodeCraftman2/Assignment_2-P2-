import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        
        students.add(new Student("John", 20, 85));
        students.add(new Student("Jane", 22, 90));
        students.add(new Student("Bob", 21, 88));

        System.out.println("Student List: " + students);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name, age and mark:");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int mark = scanner.nextInt();
        Student student = new Student(name, age, mark);
        System.out.println("Does the list contain the student? " + students.contains(student));

        students.remove(student);
        System.out.println("Student List after removal: " + students);

        System.out.println("Number of students in the list: " + students.size());
    }
}