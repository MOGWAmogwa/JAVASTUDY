package javaStudy;
import java.util.*;

public class Chapter7_436p_5 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);
		
		int count = 0 ; 
		
		while(count < 2) {

			System.out.println("�л� �̸�, �а�, �й�, ������ �Է��ϼ���.");

			System.out.println("�̸� : ");
			String student = sc.next();

			System.out.println("�а� : ");
			String major = sc.next();

			System.out.println("�й� : ");
			int id = sc.nextInt();

			System.out.println("���� : ");
			double gpa = sc.nextDouble();
			
			list.add(new Student(student, major, id , gpa));
			count++;			

		}
		
		Iterator<Student> it = list.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("�л��̸� >>");
		String name = sc.next();
		
		for (int i = 0; i < list.size() ; i++) {
			if(list.get(i).name == name) {
				System.out.println(list.get(i));
			}else {
				System.out.println("�׷� �̸��� �����ϴ�.");
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
		return "�̸� : " + name + "\n" + "�а� : " + major + "\n" + "�й� : " + id + "\n" + "����  : " + gpa + "\n------" ;
	}

}