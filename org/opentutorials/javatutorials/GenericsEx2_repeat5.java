package java_repeat;
import java.util.*;

public class GenericsEx2_repeat5 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("hong", 16012033));
		list.add(new Student("park", 16012034));
		
		Iterator<Student> it = list.iterator();
		
		while(it.hasNext()) {
			Student l = it.next();
			System.out.println("name : " + l.name + " id : " + l.id);
		}
		

	}

}

class Student {
	String name = "" ;
	long id ; 
	Student(String name, long id){
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		return name + " , " + id;
	}
}
