package java_repeat;
import java.util.*;

public class GenericsEx2_repeat1 {

	public static void main(String[] args) {
		ArrayList<Student1> studentList = new ArrayList<Student1>();
		studentList.add(new Student1("ȫ����", 16012033, 78));
		studentList.add(new Student1("ȫ����", 19492934, 81));
		studentList.add(new Student1("�̿�ȭ", 39442848, 90));
		
		Iterator<Student1> it = studentList.iterator();
		
		while(it.hasNext()) {
			Student1 s = it.next();
			System.out.println(s);
		}
		
		// ���׸����� ���� �� 
		
		/*
		 * while(it.hasNest()){
		 * Student s = (Student)it.next();
		 * 
		 * }
		 * */
			
		

	}

}

class Student1{
	String name = "";
	long id ; 
	int age;
	
	Student1(String name , long id, int age){
		this.name = name; 
		this.id = id;
		this.age = age;
	}
	
	public String toString() {
		return "name : " + this.name + " , " + "id : " + this.id + " , age : " + this.age ;
	}
	
}
