package HashSet;
import java.util.*;
public class HashSetEx2_repeat1 {

	public static void main(String[] args) {

	HashSet set = new HashSet();
	
	set.add("Exception");
	set.add("Exception");
	set.add(new Person_("Jack", 31));
	set.add(new Person_("Jack", 31));
	
	System.out.println(set);
	
	
			

	}

}



class Person_ {
	String name ; 
	int age;
	
	Person_(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}

