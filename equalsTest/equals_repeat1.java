package equalsTest;

public class equals_repeat1 {

	public static void main(String[] args) {

		Value1 v1 = new Value1(10);
		Value1 v2 = new Value1(10);
		
		if(v1.equals(v2))
			System.out.println("v1=v2");
		else 
			System.out.println("v1!=v2");
		
		v1=v2;
		
		if(v1.equals(v2))
			System.out.println("v1=v2");
		else 
			System.out.println("v1!=v2");

	}

}


class Value1 {
	int value ; 
	
	Value1(int value){
		this.value = value;
	}
}