package TIS_JAVA_STUDY;
import java.util.*;

public class CodeSignal12 {

	public static void main(String[] args) {
		

	}
	
	int[] solution(int[] a) {
		 ArrayList<Integer> list = new ArrayList<Integer>();

		    for (int i : a) {
		        if (i != -1) {
		            list.add(i);
		        }
		    }

		    Collections.sort(list);

		    int index = 0;
		    for (int i = 0; i < a.length; i++) {
		        if (a[i] != -1) {
		            a[i] = list.get(index++);
		        }
		    }

		    return a;
	}

}
