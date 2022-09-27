package javaStudy;
import java.util.*;
public class Chapter7_430p_WordQuiz {

	public static void main(String[] args) {

		ArrayList<Word> words = new ArrayList<Word>();

		words.add(new Word("emotion", "����"));
		words.add(new Word("love", "���"));
		words.add(new Word("sad", "����"));
		words.add(new Word("key", "����"));
		words.add(new Word("painting", "�׸�"));

		words.add(new Word("stage", "����"));
		words.add(new Word("dance", "��"));
		words.add(new Word("song", "�뷡"));
		words.add(new Word("step", "����"));
		words.add(new Word("phone", "�ڵ���"));

		words.add(new Word("flower", "��"));
		words.add(new Word("fruit", "����"));
		words.add(new Word("apple", "���"));
		words.add(new Word("pig", "����"));
		words.add(new Word("dog", "��"));

		Scanner sc = new Scanner(System.in);

		System.out.println("\" ��ǰ ���� \" �� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� 15���� �ܾ ����ֽ��ϴ�. ");


		boolean power = false;

		while(!power) {

			int r = (int)(Math.random()*words.size()); // 0~15 ������ ���� 
			System.out.println(words.get(r).eng + "?");


			String[] indicate = new String[words.size()];


			// indicate  �� �� �ܾ� ����
			for(int i= 0 ; i < words.size() ; i++) {
				indicate[i] = words.get(i).kor;
			}


			// shuffle
			for(int i = 0 ; i <  words.size() ; i++) {
				int random = (int)(Math.random()*words.size());
				String temp = indicate[i];
				indicate[i] = indicate[random];
				indicate[random] = temp;

			}

			// �� ���� & ���� ���
			String answer = words.get(r).kor;
			String[] init = new String[4];


			for(int i = 0 ; i < 4 ; i++) {
				indicate[i] = words.get((r+i)%words.size()).kor; 
				
				// (r+i)%words.size() �� �ǹ� ? 
				// r+i �� words.size()�� ����� �Ǹ� ������ �߻��ϹǷ� word.size�� ������ ������ �ٲ��༭ ���� �߻� ���ϱ� 
				
				init[i] = indicate[i];
			}

			for(int i = 0 ; i < init.length ; i++) {
				int random = (int)(Math.random()*init.length);
				String temp = init[i];
				init[i] = init[random];
				init[random] =temp;

			}

			for(int i = 0 ; i < 4 ; i++) {
				System.out.println(  "(" +(i+1)+")"+ init[i]);
			}
			System.out.println("answer>> ");
			int A = sc.nextInt();
			if(A==-1) {
				System.out.println("�ܾ�ã�⸦ �����մϴ�.");
				break;
			}


			if(init[A-1] == answer) {	
				System.out.println("Excellent!");
				System.out.println();
			}else {
				try {
					
				}catch(ArrayIndexOutOfBoundsException ae) {
				
	
				}
				System.out.println("No!!");
				System.out.println();
			}

		}


	}

}

class Word{
	String eng = "";
	String kor = "";

	Word(String eng, String kor){
		this.eng = eng;
		this.kor = kor;
	}

}
