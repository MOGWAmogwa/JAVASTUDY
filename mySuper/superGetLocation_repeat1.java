package mySuper;

public class superGetLocation_repeat1 {

	public static void main(String[] args) {
		Point_1 p1 = new Point_1(10,10);
		Point3d_1 p3d1 = new Point3d_1(30,30,40);

		System.out.println(p1.getLocation());
		System.out.println(p3d1.getLocation());

	}

}


class Point_1 {
	int x ; 
	int y ; 

	Point_1 (int x, int y ){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return " " + x + " , " + y;
	}
}

class Point3d_1 extends Point_1 {
	
	int z ;
	
	Point3d_1 (int x, int y, int z ){
		super(x,y);
		this.z = z;
		
	}
	
	String getLocation() {
		return super.getLocation() + " , " + z;
	}
	
}