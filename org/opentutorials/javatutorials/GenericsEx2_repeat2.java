package java_repeat;
import java.util.*;

public class GenericsEx2_repeat2 {

	public static void main(String[] args) {
		ArrayList<Student2> studentList = new ArrayList<Student2>();
		studentList.add(new Student2("È«Çıºó", 2304223, 98, 4.5));
		studentList.add(new Student2("È«Çı¹Î", 2302422, 34, 4.35));
		studentList.add(new Student2("º¯ÁöÇö", 2234224, 48, 4.5));
		
		Iterator<Student2> it = studentList.iterator();
		
		while(it.hasNext()) {
			Student2 student = it.next();
			System.out.println(student);
		}
		


	}

}


class Student2 {
	String name = "";
	long id ; 
	int age ; 
	double gpa ;
	
	Student2(String name, long id, int age, double gpa){
		this.name = name;
		this.id = id; 
		this.age = age; 
		this.gpa = gpa;
	}
	
	public String toString() {
		return "[" + this.name + " : " + this.gpa + "]" ;
	}
	
	
	
}