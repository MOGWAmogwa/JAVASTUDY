//package BankApp;
//import java.util.*;
//
//public class BankApp {
//	Account[] acc = new Account[100];
//	Scanner sc = new Scanner(System.in);
//
//	void info() {
//		System.out.println("-----------------------------------");
//		System.out.println("1.���»���  2.���¸��  3.����  4.���  5.����");
//		System.out.println("-----------------------------------");
//		System.out.println();
//		System.out.println("���� : ");
//
//	}
//
//	void createAccount() {
//
//		System.out.println("----------------------");
//		System.out.println("-------���»����޴�------");
//		System.out.println("----------------------");
//		System.out.println();
//
//		System.out.println("���¹�ȣ : ");
//		String ano = sc.next();
//
//		System.out.println("�����ָ� : ");
//		String owner = sc.next();
//
//		System.out.println("�ʱ��Աݾ� : ");
//		int balance = sc.nextInt();
//
//		System.out.println("���ڸ� �Է� : ");
//		double rate = sc.nextDouble();
//
//
//
//		for(int i = 0 ; i < acc.length ; i++) {
//
//			if(acc[i]==null) {
//				acc[i] = new Account(ano, owner, balance, rate);
//				System.out.println("���°� �����Ǿ����ϴ�.");
//				break;
//			}
//
//			System.out.println("���¹�ȣ : " +  acc[i].getAno());
//			System.out.println("�����ָ� : " +  acc[i].getOwner());
//			System.out.println("�ʱ��Աݾ� : " +  acc[i].getBalance());
//			System.out.println("������ : " +  acc[i].getRate());
//
//		}
//
//
//
//	}
//
//	void accountList() {
//		System.out.println("----------------------");
//		System.out.println("-----���¸�Ϻ���޴�------");
//		System.out.println("----------------------");
//		System.out.println();
//
//		System.out.println("��ȣ       ������        �Աݾ�        ������      ��ݰ��ɾ�");
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
//			//�̰� ���� �Ѱ�
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
//		// �̰� ���� �Ѱ�
//		//		Scanner sc = new Scanner(System.in);
//		//		System.out.println("�����ڸ��� �Է��Ͽ� �ֽʽÿ�.");
//		//		String name = sc.next();
//		//		
//		//		System.out.println("�Ա� �ݾ��� �Է��Ͽ� �ֽʽÿ�. ");
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
//		System.out.println("------���� ��� �޴�------");
//		System.out.println("----------------------");
//		System.out.println();
//
//		System.out.println("���¹�ȣ : ");
//		String ano = sc.next();
//
//		System.out.println("�Աݾ� : ");
//		int balance = sc.nextInt();
//
//		Account account = findAccount(ano);
//
//		if(account == null) {
//			System.out.println("���°� �����ϴ�.");
//			return;
//		}
//
//		account.setBalance(account.getBalance()+balance);
//		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
//
//	}
//
//	void withdraw() {
//		System.out.println("----------------------");
//		System.out.println("------��� ��� �޴�------");
//		System.out.println("----------------------");
//		System.out.println();
//
//		System.out.println("���¹�ȣ : ");
//		String ano = sc.next();
//
//		System.out.println("��ݾ� : ");
//		int balance = sc.nextInt();
//
//		Account account = findAccount(ano);
//
//		if(account == null) {
//			System.out.println("���°� �����ϴ�.");
//			return;
//		}
//
//		if(account.getBalance() == 0 )  {
//			System.out.println("�ܾ��� �����ϴ�.");
//		}
//
//		if(account.getBalance() < balance) {
//			System.out.println("�����ܰ� �����մϴ�.");
//		}
//
//		account.setBalance(account.getBalance()-balance);
//		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
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
