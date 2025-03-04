import java.util.*;
class StudentOperations{
	ArrayList<Student> students; // Student erefers to student.java
	
	public StudentOperations()
	{
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student){
		students.add(student);
		System.out.println("Student Added.");
	}
	
	public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
