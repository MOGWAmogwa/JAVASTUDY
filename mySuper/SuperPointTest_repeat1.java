package mySuper;

public class SuperPointTest_repeat1 {

	public static void main(String[] args) {
		Point3D_2 point3d = new Point3D_2(10,20,30);
		System.out.println(point3d.getLocation());


	}

}

class Point2 { 
	int x ; 
	int y ; 

	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x : " + x + " y : " + y ;
	}


}

class Point3D_2 extends Point2 {
	int z ;

	Point3D_2(int x, int y, int z){
		super(x,y);
		this.z = z;
	}

	String getLocation() {
		return super.getLocation() + " z : " + z  ;
	}
}
