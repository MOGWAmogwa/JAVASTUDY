package equalsTest;

class Person1 {
	long id ; 
	
	public boolean equals(Object obj) {
		if (obj instanceof Person1)
			return id == ((Person1)obj).id;
		else 
			return false;
	}
	
	Person1(long id){
		this.id =id;
	}
	
	
}

public class Equals_personTest_repeat1 {

	public static void main(String[] args) {
		Person1 HyeMin = new Person1(930924);
		Person1 HongHyeMin = new Person1(930924);
		
		if(HyeMin == HongHyeMin)
			System.out.println("HyeMin == HongHyeMin");
		else 
			System.out.println("HyeMin != HongHyeMin");
		
		
		if(HyeMin.equals(HongHyeMin))
			System.out.println("HyeMin==HongHyeMin");
		else 
			System.out.println("HyeMin!=HongHyeMin");

	}

}
