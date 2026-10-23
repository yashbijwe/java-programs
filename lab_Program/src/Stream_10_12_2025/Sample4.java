package Stream_10_12_2025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//write a program to create  a list of students with their name,rollno,section
// Sort and display their details in ascending order of their rollno.
class Student{
	String name;
	int rollNo;
	char section;
	public Student(String name, int rollNo, char section) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.section = section;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public char getSection() {
		return section;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setSection(char section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "name=" + name + "\nrollNo=" + rollNo + "\nsection=" + section + "\n";
	}
	

}
public class Sample4 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Ashish",1,'A'),
				                               new Student ("Bishal",4,'A'),
				                               new Student ("Deepak",6,'A'),
				                               new Student ("Chimay",3,'A'),
				                               new Student ("Abhinash",5,'A'),
				                               new Student ("Divid",2,'A'));
		System.out.println("Students in class are:");
		students.forEach(System.out::println);
		System.out.println("Student list after sorting them bases on their roll No");
		students.stream().sorted(Comparator.comparing(s->s.getRollNo())).
		forEach(s->System.out.println(s.getRollNo()+". "+s.getName()));
		
		
	}

}
/*
 * sorted(): It is used to sort elements of a stream in Nso if they are 
 * String objects or integer objects.
 * We can use Comparator to sort the integer base on our requirement*/
