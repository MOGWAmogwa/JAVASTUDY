package equalsTest;

public class equals_personTest_repeat3 {

	public static void main(String[] args) {
		Person_ bina = new Person_(960422);
		Person_ hongbin = new Person_(960422);

		if (bina == hongbin)
			System.out.println("bina == hongbin");
		else 
			System.out.println("bina != hongbin");


		if(bina.equals(hongbin))
			System.out.println("bina==hongbin");
		else 
			System.out.println("bina!=hongbin");

	}

}


class Person_{
	long id;

	public boolean equals(Object obj) {
		if(obj instanceof Person_)
			return id ==((Person_)obj).id;
		else 
			return false;
	}

	Person_(long id){
		this.id = id;
	}

}
