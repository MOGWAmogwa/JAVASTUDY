package instanceOf;

public class InstanceOfTest_repeat2 {

	public static void main(String[] args) {
		FireEngine2 fe = new FireEngine2("white", 6);
		FireEngine2 fe2 = new FireEngine2();

		if(fe instanceof FireEngine2) {
			System.out.println(fe);
		} 
		
		if(fe2 instanceof FireEngine2) {
			System.out.println(fe2);
		} 
		

		if (fe instanceof Car2) {
			System.out.println(fe);
		}

	}

}

class Car2 {
	String color ;
	int door ; 
	
	Car2 (){
		this("black", 4);
	}
	
	Car2(String color, int door){
		this.color = color;
		this.door = door;
	}
	
	public String toString() {
		return "Car Type - color " + color + " door ea " + door;
	}
}

class FireEngine2 extends Car2 {
	
	String engineType = "fire engine";

	public FireEngine2() {
		this("pink", 4);
	}
	
	public FireEngine2(String color, int door) {
		super(color, door);
	}

	public String toString() {
		return "Car Type - engine " + engineType + " / color : " + color + " / door ea " + door;
	}
}