package java_repeat;
import java.util.*;


public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Human(43, "David"));
		set.add(new Human(43, "David")); // 객체 주소가 다르기 때문에 다른 사람으로 인식
		
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