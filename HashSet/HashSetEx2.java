package HashSet;

import java.util.*;

public class HashSetEx2 {

	public static void main(String[] args) {
		// 남궁성 T 깃허브에 Ex2가 없어서 Ex3을 Ex2 라고 함
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);


	}

}

class Person {
	String name ; 
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
}
