package equalsTest;

public class equals_personTest_repeat2 {

	public static void main(String[] args) {
		
		Person HHM = new Person(930924);
		Person Hongmin = new Person(930924);
		
		

	}

}


class Person {
	long id ; 
	
	Person (long id){
		this.id = id;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Person)
			return this.id == ((Person) o).id;
		else 
			return false;
	}
}