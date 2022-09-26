package java_repeat;

public class WrapperClassEx1 {

	public static void main(String[] args) {
		
		// ch9 -  wrapper class
		
		Integer i  = new Integer(100);
		Integer i2 = new Integer(100); // 객체 주소가 서로 다름

		System.out.println("i==i2 ? "+(i==i2));
		System.out.println("i.equals(i2) ? "+i.equals(i2));
		System.out.println("i.compareTo(i2)="+i.compareTo(i2)); // 같으면 0, 오른족 값이 작으면 양수, 오른쪽 값이 크면 음수, 정렬에 사용(여러 값을 비교해서 나열할때)
		System.out.println("i.toString()="+i.toString());

		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("SIZE=" +Integer.SIZE+" bits");
		System.out.println("BYTES="+Integer.BYTES+" bytes"); // 32비트 4byte
		System.out.println("TYPE=" +Integer.TYPE); // int

	}

}
