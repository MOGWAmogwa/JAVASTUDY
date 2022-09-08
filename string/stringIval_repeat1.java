package string;

public class stringIval_repeat1 {

	public static void main(String[] args) {
		int val = 100;

		String str1 = String.valueOf(val);
		
		double val2 = 200.0;
		String str2 = val2 + "";
		
		double sum = Integer.parseInt("-" + str1) + Double.parseDouble("-" + str2);
		System.out.println(sum);
	}

}
