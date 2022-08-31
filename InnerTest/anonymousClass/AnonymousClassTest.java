package InnerTest.anonymousClass;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.*;

public class AnonymousClassTest {

	public static void main(String[] args) {
		Button b = new Button("start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("action occured");
			}
		});

	}

}

public class AnonymousClassTest {
	public static void main(String[] args) {
		button b = new Button ('start')
	}
}

// 똑같이 썻는데도 에러나는 거 보면 뭔가 임포트를안했거나 그런둡.. 뭔지 모르겠음 일단 넘어가기