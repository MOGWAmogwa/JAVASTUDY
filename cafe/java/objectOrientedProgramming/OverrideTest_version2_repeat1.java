package cafe.java.objectOrientedProgramming;


class Point3 extends Object{
	int x ; 
	int y ; 
	
	Point3(){}

	Point3(int x , int y){
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x : " + x + " , y : " + y	;
	}

}
public class OverrideTest_version2_repeat1 {

	public static void main(String[] args) {
		Point3 p3 = new Point3(3,5);
		System.out.println(p3.toString());

	}

}

