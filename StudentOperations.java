import java.util.*;
class StudentOperations{
	ArrayList<Student> students; // Student refers to student.java
	
	public StudentOperations()
	{
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student){
		students.add(student);
		System.out.println("Student Added successfully.");
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
	
	// Search student by PRN
    public Student searchByPRN(long prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                return student;
            }
        }
        return null;
    }

    // Search student by Name
    public Student searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // Search by position (index)
    public Student searchByPosition(int index) {
        if (index >= 0 && index < students.size()) {
            return students.get(index);
        }
        return null;
    }
	
	// Update Student Details
    public boolean updateStudent(long prn, String newName, String newDob, double newMarks) {
        Student student = searchByPRN(prn);
        if (student != null) {
            student.setName(newName);
            student.setDob(newDob);
            student.setMarks(newMarks);
            System.out.println("Student details updated.");
            return true;
        }
        return false;
    }

    // Delete a student
    public boolean deleteStudent(long prn) {
        Student student = searchByPRN(prn);
        if (student != null) {
            students.remove(student);
            System.out.println("Student removed successfully.");
            return true;
        }
        return false;
    }

}
