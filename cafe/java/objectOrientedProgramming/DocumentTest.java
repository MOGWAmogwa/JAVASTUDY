package cafe.java.objectOrientedProgramming;

class Document {
	static int count = 0 ; 
	String name ;
	
	Document(){
		this("untitled" + ++count);
	}
	Document(String name){
		this.name = name;
		System.out.println("Document " + this.name + " is created now.");
	}
}
public class DocumentTest {

	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("Java");
		Document d3 = new Document();
	}

}

