package TIS_JAVA_STUDY;

public class AbstractClassEx {

	public static void main(String[] args) {
	
		Unit_[] group = new Unit_[3];
		
		for(int i = 0 ; i < group.length ;  i++) {
			group[i] = new Tank_();
		}
		System.out.println(group[2]);
	}

}


abstract class Unit_ {
	int x , y;
	
	abstract void move(int x, int y);
	
	void stop() {
		System.out.println("stop");
	}
}

class Tank_ extends Unit_ {
	void move(int x, int y) {
		System.out.printf("Tank [%d, %d]" , x, y);
	}
	
	public String toString() {
		return "Tank_";
	}
}


class Marine_ extends Unit_ {
	void move(int x, int y) {
		System.out.printf("Marine_ [%d, %d]" , x, y);
	}
	public String toString() {
		return "Marine_";
	}
}


class Dropship_ extends Unit_ {
	void move(int x, int y) {
		System.out.printf("Dropship [%d, %d]" , x, y);
	}
	public String toString() {
		return "Dropship_";
	}
}