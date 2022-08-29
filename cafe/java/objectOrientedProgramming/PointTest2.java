package cafe.java.objectOrientedProgramming;

public class PointTest2 {

	public static void main(String[] args) {
		Point4D p3 = new Point4D();
		System.out.println(p3.x);

	}

}


class Point4 {
	
	int x = 10;
	int y = 20 ;
	
	
	Point4(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point4D extends Point4{
	
	int z = 30;
	
	Point4D(){
		this(100, 200, 300);
	}
	
	Point4D(int x, int y, int z){
		super(x, y);
		this.z=z;
		
	}
	
}