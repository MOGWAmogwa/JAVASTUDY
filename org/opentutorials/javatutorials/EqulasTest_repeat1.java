package java_repeat;

public class EqulasTest_repeat1 {

	public static void main(String[] args) {

		Person bina = new Person(16012033);
		Person hongbin =  new Person(16012033);
		
		if(bina==hongbin) // 객체 주소이기 때문
			System.out.println("bina==hongbin");
		else
			System.out.println("bina!=hongbin");
		
		
		if (bina.equals(hongbin))
			System.out.println("bina==hongbin");
		else
			System.out.println("bina!=hongbin");
	}

}





class Person_ {
	long id ;
	
	Person_(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Person_)
			return this.id == ((Person_)obj).id;
		else
			return false;
	}
}