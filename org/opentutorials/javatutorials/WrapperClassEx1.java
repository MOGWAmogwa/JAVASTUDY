package java_repeat;

public class WrapperClassEx1 {

	public static void main(String[] args) {
		
		// ch9 -  wrapper class
		
		Integer i  = new Integer(100);
		Integer i2 = new Integer(100); // ��ü �ּҰ� ���� �ٸ�

		System.out.println("i==i2 ? "+(i==i2));
		System.out.println("i.equals(i2) ? "+i.equals(i2));
		System.out.println("i.compareTo(i2)="+i.compareTo(i2)); // ������ 0, ������ ���� ������ ���, ������ ���� ũ�� ����, ���Ŀ� ���(���� ���� ���ؼ� �����Ҷ�)
		System.out.println("i.toString()="+i.toString());

		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
		System.out.println("SIZE=" +Integer.SIZE+" bits");
		System.out.println("BYTES="+Integer.BYTES+" bytes"); // 32��Ʈ 4byte
		System.out.println("TYPE=" +Integer.TYPE); // int

	}

}
