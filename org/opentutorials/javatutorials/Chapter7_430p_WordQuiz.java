package javaStudy;
import java.util.*;
public class Chapter7_430p_WordQuiz {

	public static void main(String[] args) {

		ArrayList<Word> words = new ArrayList<Word>();

		words.add(new Word("emotion", "감정"));
		words.add(new Word("love", "사랑"));
		words.add(new Word("sad", "슬픔"));
		words.add(new Word("key", "열쇠"));
		words.add(new Word("painting", "그림"));

		words.add(new Word("stage", "무대"));
		words.add(new Word("dance", "춤"));
		words.add(new Word("song", "노래"));
		words.add(new Word("step", "걸음"));
		words.add(new Word("phone", "핸드폰"));

		words.add(new Word("flower", "꽃"));
		words.add(new Word("fruit", "과일"));
		words.add(new Word("apple", "사과"));
		words.add(new Word("pig", "돼지"));
		words.add(new Word("dog", "개"));

		Scanner sc = new Scanner(System.in);

		System.out.println("\" 명품 영어 \" 의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 15개의 단어가 들어있습니다. ");


		boolean power = false;

		while(!power) {

			int r = (int)(Math.random()*words.size()); // 0~15 사이의 숫자 
			System.out.println(words.get(r).eng + "?");


			String[] indicate = new String[words.size()];


			// indicate  에 각 단어 배정
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

			// 답 배정 & 문제 출력
			String answer = words.get(r).kor;
			String[] init = new String[4];


			for(int i = 0 ; i < 4 ; i++) {
				indicate[i] = words.get((r+i)%words.size()).kor; 
				
				// (r+i)%words.size() 의 의미 ? 
				// r+i 가 words.size()를 벗어나게 되면 오류가 발생하므로 word.size의 나머지 값으로 바꿔줘서 오류 발생 피하기 
				
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
				System.out.println("단어찾기를 종료합니다.");
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
