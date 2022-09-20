package TIS_JAVA_STUDY;

public class EqualTest {

	public static void main(String[] args) {
		
		Person bina = new Person(16012033);
		Person hongbin =  new Person(16012033);
		
		if(bina==hongbin) // ��ü �ּ��̱� ����
			System.out.println("bina==hongbin");
		else
			System.out.println("bina!=hongbin");
		
		
		if (bina.equals(hongbin))
			System.out.println("bina==hongbin");
		else
			System.out.println("bina!=hongbin");
	}

}




class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id ==((Person)obj).id;
		else
			return false;
		
	}
	
	Person(long id){
		this.id = id;
	}
}