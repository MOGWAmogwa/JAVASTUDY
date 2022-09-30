//package BankApp;
//import java.util.*;
//
//public class BankApp {
//	Account[] acc = new Account[100];
//	Scanner sc = new Scanner(System.in);
//
//	void info() {
//		System.out.println("-----------------------------------");
//		System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금  5.종료");
//		System.out.println("-----------------------------------");
//		System.out.println();
//		System.out.println("선택 : ");
//
//	}
//
//	void createAccount() {
//
//		System.out.println("----------------------");
//		System.out.println("-------계좌생성메뉴------");
//		System.out.println("----------------------");
//		System.out.println();
//
//		System.out.println("계좌번호 : ");
//		String ano = sc.next();
//
//		System.out.println("계좌주명 : ");
//		String owner = sc.next();
//
//		System.out.println("초기입금액 : ");
//		int balance = sc.nextInt();
//
//		System.out.println("이자를 입력 : ");
//		double rate = sc.nextDouble();
//
//
//
//		for(int i = 0 ; i < acc.length ; i++) {
//
//			if(acc[i]==null) {
//				acc[i] = new Account(ano, owner, balance, rate);
//				System.out.println("계좌가 생성되었습니다.");
//				break;
//			}
//
//			System.out.println("계좌번호 : " +  acc[i].getAno());
//			System.out.println("계좌주명 : " +  acc[i].getOwner());
//			System.out.println("초기입금액 : " +  acc[i].getBalance());
//			System.out.println("이자율 : " +  acc[i].getRate());
//
//		}
//
//
//
//	}
//
//	void accountList() {
//		System.out.println("----------------------");
//		System.out.println("-----계좌목록보기메뉴------");
//		System.out.println("----------------------");
//		System.out.println();
//
//		System.out.println("번호       계좌주        입금액        이자율      출금가능액");
//
//		for(int i = 0 ; i < acc.length ; i++) {
//
//			if(acc[i] != null) {
//				acc[i].rateCal();
//				System.out.println(acc[i].getAno() + "\t" + acc[i].getOwner() + "\t" + acc[i].getBalance() + "\t" + acc[i].getRate()+"\t" + acc[i].getAmount());
//			}else {
//				break;
//			}
//
//
//			//이건 내가 한거
//			//			if(acc[i] != null) {
//			//				System.out.print(acc[i].getAno());
//			//				System.out.print(acc[i].getOwner());
//			//				System.out.print(acc[i].getBalance());
//			//			}else {
//			//				System.out.print("___");
//			//			}
//			//			System.out.println();
//		}
//	}
//
//	void deposit() {
//
//		// 이건 내가 한거
//		//		Scanner sc = new Scanner(System.in);
//		//		System.out.println("예금자명을 입력하여 주십시오.");
//		//		String name = sc.next();
//		//		
//		//		System.out.println("입금 금액을 입력하여 주십시오. ");
//		//		int deposit = sc.nextInt();
//		//		
//		//		for(int i = 0 ; i < acc.length ; i++) {
//		//			
//		//			if(name.equals(acc[i])) {
//		//				acc[i].setBalance(acc[i].getBalance()+deposit);
//		//			}
//		//		}
//
//		System.out.println("----------------------");
//		System.out.println("------예금 기능 메뉴------");
//		System.out.println("----------------------");
//		System.out.println();
//
//		System.out.println("계좌번호 : ");
//		String ano = sc.next();
//
//		System.out.println("입금액 : ");
//		int balance = sc.nextInt();
//
//		Account account = findAccount(ano);
//
//		if(account == null) {
//			System.out.println("계좌가 없습니다.");
//			return;
//		}
//
//		account.setBalance(account.getBalance()+balance);
//		System.out.println("입금이 완료되었습니다.");
//
//	}
//
//	void withdraw() {
//		System.out.println("----------------------");
//		System.out.println("------출금 기능 메뉴------");
//		System.out.println("----------------------");
//		System.out.println();
//
//		System.out.println("계좌번호 : ");
//		String ano = sc.next();
//
//		System.out.println("출금액 : ");
//		int balance = sc.nextInt();
//
//		Account account = findAccount(ano);
//
//		if(account == null) {
//			System.out.println("계좌가 없습니다.");
//			return;
//		}
//
//		if(account.getBalance() == 0 )  {
//			System.out.println("잔액이 없습니다.");
//		}
//
//		if(account.getBalance() < balance) {
//			System.out.println("통장잔고가 부족합니다.");
//		}
//
//		account.setBalance(account.getBalance()-balance);
//		System.out.println("출금이 완료되었습니다.");
//
//	}
//
//
//	Account findAccount(String ano) {
//
//		Account account = null;
//
//		for(int i = 0 ; i < acc.length ; i++) {
//
//			if(ano.equals(acc[i].ano)) {
//				account= acc[i];
//				break;
//			}
//
//		}
//
//		return account;
//
//
//	}
//
//
//}
