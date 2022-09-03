package equalsTest;

class Person {
	long id ;
	
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

public class Equlas_personTest {

	public static void main(String[] args) {
		Person bina = new Person(16012033);
		Person hongbin = new Person(16012033);
		
		if(bina==hongbin)
			System.out.println("bina==hongbin");
		else 
			System.out.println("bina!=hongbin");
		
		if(bina.equals(hongbin))
			System.out.println("bina==hongbin");
		else 
			System.out.println("bina!=hongbin");
	
		
	}

}


