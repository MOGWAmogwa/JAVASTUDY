package java_repeat;
import java.util.*;

public class GenericTest_repeat1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
//		list.add("30"); // Integer  ��ü��  list�� �� �� �����Ƿ� ������ �߻��Ѵ�. 
		list.add(30);
		
		System.out.println(list.get(1)); // ���׸����� ������� �ʴ� ��쿡�� ����Ÿ����  Object�̹Ƿ� 
		// (Integer)list.get(1); �̷������� �ٲپ� �־�� �Ѵ�. 
		
	}

}
