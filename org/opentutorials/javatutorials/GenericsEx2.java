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
//		// ���׸��� ��� �� 
//		
//		while(it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s);
//		}
//		
//		// ���׸��� �̻�� �� 
//		
//
////		while(it.hasNext()) {
////			Student s = (Student)it.next();
////			System.out.println(s);
////		}
		
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("jack", new Student("jack", 1 ,1 ,100, 100, 100));
		map.put("michael", new Student("michael", 2 ,2 ,34, 77, 77));
		
		// ���׸����� �̿����� ������ �Ʒ�ó�� �ؾ���
		// Student s = (Student)map.get("jack"); �ֳ��ϸ� map.get(key); �ϰ� �Ǹ� ����Ÿ���� Object�̱� ����

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
		return "[ �̸� : " + this.name + " , �� : " + this.ban + " , ��ȣ : " + this.no + "]"; 
	}

}



