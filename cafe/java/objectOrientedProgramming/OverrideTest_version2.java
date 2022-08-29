package cafe.java.objectOrientedProgramming;


class Point2 extends Object{
	int x ; 
	int y ; 
	
	// Object 클래스의 toString()을 오버라이딩
	Point2(int x , int y ){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x:" + x + " , y: " + y;
	}
}


public class OverrideTest_version2 {

	public static void main(String[] args) {
		Point2 p = new Point2(1, 2);

//		System.out.println("p.x = " + p.x + " p.y = " + p.y);
		System.out.println(p);

	}
 
}
