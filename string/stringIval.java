package string;

public class stringIval {

	public static void main(String[] args) {
		
		int iVal = 100;
		String strVal = String.valueOf(iVal); //"100"
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; // "200.0"
		
		double sum = Integer.parseInt("-" + strVal)+Double.parseDouble("-"+strVal2); // "-" 은 음수라는 뜻
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(sum);
		System.out.println(sum2);

	}

}
