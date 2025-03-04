import java.util.*;
public class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Enter your PRN: ");
		long prn = Long.parseLong(sc.nextLine());
		
		StudentOperations operations = new StudentOperations();
		Student student = new Student(name, prn);
		operations.addStudent(student);
		operations.displayStudents();
	}
}
