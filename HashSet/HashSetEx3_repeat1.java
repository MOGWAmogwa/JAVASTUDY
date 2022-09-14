package HashSet;
import java.util.*;

public class HashSetEx3_repeat1 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("a");
		set.add("a");
		set.add(new Person_());
		set.add(new Person_());
		
		
		
		

	}

}

class Person_{
	String name ; 
	int age ; 
	
	Person_(String name , int age){
		this.name=name;
		this.age=age;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Person_) {
			Person_ temp = (Person_)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}
	
	public int hashCode() {
		return (name + age).hashCode();
		
	}
	
	public String toString() {
		return name + "" + age;
	}
	
	
	
}
