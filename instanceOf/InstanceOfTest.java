package instanceOf;

class InstanceOfTest {

	 static void main(String[] args) {

		 FireEngine fe = new FireEngine();
		 
		 if(fe instanceof FireEngine) {
			 System.out.println("This is a FireEngine instance.");
		 }
		 
		 if(fe instanceof Car) {
			 System.out.println("This is a Car instance.");
		 }
		 
		 System.out.println(fe);
		 

	}

}


class Car {}

class FireEngine extends Car {}