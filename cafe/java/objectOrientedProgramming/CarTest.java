package cafe.java.objectOrientedProgramming;


class Car2{
	String color;
	String gearType;
	int door;

	Car2(){
		this("white", "auto", 4);
	}
	
	Car2(String color){
		this.(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
