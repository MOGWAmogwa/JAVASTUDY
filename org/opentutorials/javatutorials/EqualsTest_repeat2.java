package java_repeat;

public class EqualsTest_repeat2 {

	public static void main(String[] args) {
		Person2 bina  = new Person2(16012033); // ��ü �ּҰ� ���� �ٸ�
		Person2 mogwa  = new Person2(16012033); // ��ü �ּҰ� ���� �ٸ�


		if (bina == mogwa) // ��ü �ּҰ� ���İ� ���� ��
			System.out.println("bina == mogwa");
		else
			System.out.println("bina != mogwa");



		if(bina.equals(mogwa)) // id ���� ������ ���� ��
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