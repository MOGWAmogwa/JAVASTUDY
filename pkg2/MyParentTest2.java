package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent{
	public void printMembers() {
//		System.out.println(prv); 같은 클래스 내에서만
//		System.out.println(dft); 같은 패키지 내에서만
		System.out.println(prt); // 다른 패키지일지라도 자손 클래스에서는 접근 가능
		System.out.println(pub); // 전체 접근 가능
		
	}
}

public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);
//		System.out.println(p.dft);
//		System.out.println(p.prt);
		System.out.println(p.pub); // 접근 제한 없음
	}

}
