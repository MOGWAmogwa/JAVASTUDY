package java_repeat;

public class InstanceOfEx {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof Object)
			System.out.println("FireEngine instance");
		
		
		System.out.println(fe.getClass().getName());
	}

}
