package java_repeat;
import java.util.*;


public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Human(43, "David"));
		set.add(new Human(43, "David")); // ��ü �ּҰ� �ٸ��� ������ �ٸ� ������� �ν�
		
		System.out.println(set);
	
	}

}

class Human {
	
	int age;
	String name;
	
	Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return name + "";
	}
	
}