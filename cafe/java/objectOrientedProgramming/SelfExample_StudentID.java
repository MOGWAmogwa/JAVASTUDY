package cafe.java.objectOrientedProgramming;

public class SelfExample_StudentID {

	public static void main(String[] args) {
		StudentInformation s1 = new StudentInformation("HONGHYEBIN", "Education", 16012033, 4.2);
		StudentInformation s2 = new StudentInformation();
		System.out.println(s1.name);
		s1.notice();

		EstimateGPA e1 = new EstimateGPA("HONGHYEBIN", "Education", 16012033, 4.2, true);
		e1.noticeResult();
	}
}

class StudentInformation {
	String name ;
	String major;
	int STUDENT_ID;
	double GPA;


	StudentInformation(){
		this("none", "none", 0 , 0);
		System.out.println("Please fill out all the information!");
	}
	

	StudentInformation(String name,String major,int STUDENT_ID, double GPA ){
		this.name = name;
		this.major = major;
		this.STUDENT_ID = STUDENT_ID;
		this.GPA = GPA;
	}

	void notice(){
		System.out.println(this.name + " is credntial student for Sejong University.");
	}


}

class EstimateGPA extends StudentInformation {
	boolean result;

	EstimateGPA (String name,String major,int STUDENT_ID, double GPA, boolean result){
		super(name, major,STUDENT_ID,GPA );
		this.result = result;
	}
	
	void noticeResult() {
		if(this.result==true) 
			System.out.println("You've passed");
		else
			System.out.println("Unfortunately, you failed");
	}
	
	
}