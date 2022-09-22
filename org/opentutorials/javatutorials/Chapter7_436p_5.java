package javaStudy;
import java.util.*;

public class Chapter7_436p_5 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);
		
		int count = 0 ; 
		
		while(count < 2) {

			System.out.println("학생 이름, 학과, 학번, 성적을 입력하세요.");

			System.out.println("이름 : ");
			String student = sc.next();

			System.out.println("학과 : ");
			String major = sc.next();

			System.out.println("학번 : ");
			int id = sc.nextInt();

			System.out.println("성적 : ");
			double gpa = sc.nextDouble();
			
			list.add(new Student(student, major, id , gpa));
			count++;			

		}
		
		Iterator<Student> it = list.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("학생이름 >>");
		String name = sc.next();
		
		for (int i = 0; i < list.size() ; i++) {
			if(list.get(i).name == name) {
				System.out.println(list.get(i));
			}else {
				System.out.println("그런 이름은 없습니다.");
			}
		}


		
	
		
		
	}

}



class Student {
	String name = "";
	String major = "";
	int id ;
	double gpa ;

	Student(String name, String major, int id, double gpa){
		this.name = name; 
		this.major = major;
		this.id = id;
		this.gpa = gpa;
	}
	
	
	public String toString() {
		return "이름 : " + name + "\n" + "학과 : " + major + "\n" + "학번 : " + id + "\n" + "성적  : " + gpa + "\n------" ;
	}

}