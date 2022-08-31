package mySuper;

public class SuperPointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(10,30, 60);
		System.out.println(p3.getLocation());
	}

}

class Point1 {
	int x ;
	int y ; 
	
	Point1 (int x , int y ){
		this.x = x; 
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + " y : " + y ;
		
	}
}

class Point3D extends Point_1 {
	int z ; 
	
	Point3D (int x, int y , int z) {
		super(x, y);
		this.z = z;
	}
	
	String getLocation() {
		return super.getLocation() + " z : " + z ; 
	}
}
