package mySuper;

public class superGetLocation {

	public static void main(String[] args) {
		PointChild pc = new PointChild(10,60,30);
		System.out.println(pc.getLocation());


	}

}


class Point {
	int x ;
	int y ; 
	
	Point(int x , int y ){
		this.x = x;
		this.y = y; 
	}
	
	String getLocation() {
		return "x's coordinate : " + x + " y's coordinate : " + y;
	}
}

class PointChild extends Point {
	int z ;
	PointChild(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return super.getLocation() + " z's coordinate : " + z;
	}

	
}