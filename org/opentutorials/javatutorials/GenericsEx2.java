package java_repeat;
import java.util.*;

public class GenericsEx2 {

	public static void main(String[] args) {
//		ArrayList<Student> list = new ArrayList<Student>();
//		
//		list.add(new Student("bina", 1, 41));
//		list.add(new Student("mini", 2, 38));
//		list.add(new Student("okhwa", 3, 26));
//		
//		Iterator<Student> it = list.iterator();
//		
//		// 지네릭스 사용 시 
//		
//		while(it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s);
//		}
//		
//		// 지네릭스 미사용 시 
//		
//
////		while(it.hasNext()) {
////			Student s = (Student)it.next();
////			System.out.println(s);
////		}
		
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("jack", new Student("jack", 1 ,1 ,100, 100, 100));
		map.put("michael", new Student("michael", 2 ,2 ,34, 77, 77));
		
		// 지네릭스를 이용하지 않으면 아래처럼 해야함
		// Student s = (Student)map.get("jack"); 왜냐하면 map.get(key); 하게 되면 리턴타입이 Object이기 때문

		Student s = map.get("jack"); 
	
	}
}

class Student{
	String name = "";
	int ban ; 
	int no ;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no , int kor , int eng , int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String toString() {
		return "[ 이름 : " + this.name + " , 반 : " + this.ban + " , 번호 : " + this.no + "]"; 
	}

}



