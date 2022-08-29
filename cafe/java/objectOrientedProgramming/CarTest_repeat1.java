package cafe.java.objectOrientedProgramming;


class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3(){
		this("white", "auto", 4);
	}
	
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest_repeat1 {

	public static void main(String[] args) {
		Car3 c = new Car3();
		System.out.println(c.color);

	}

}
