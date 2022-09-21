package java_repeat;

public class EqualsTest_repeat2 {

	public static void main(String[] args) {
		Person2 bina  = new Person2(16012033); // 객체 주소가 서로 다름
		Person2 mogwa  = new Person2(16012033); // 객체 주소가 서로 다름


		if (bina == mogwa) // 객체 주소가 같냐고 묻는 꼴
			System.out.println("bina == mogwa");
		else
			System.out.println("bina != mogwa");



		if(bina.equals(mogwa)) // id 값이 같은지 묻는 꼴
			System.out.println("bina == mogwa");
		else
			System.out.println("bina != mogwa");


	}

}


class Person2{
	long id;

	Person2(long id){
		this.id = id;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Person2)
			return id == ((Person2)obj).id;
		else
			return false;
	}

}