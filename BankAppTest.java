//package BankApp;
//import java.util.*;
//
//public class BankAppTest {
//
//	public static void main(String[] args) {
//		BankApp ba = new BankApp();
//		
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println();
//		System.out.println("======================");
//		System.out.println("=    ������������ý���      =");
//		System.out.println("======================");
//		System.out.println();
//
//
//		while(true) {
//			
//			ba.info();
//			int choice	 = sc.nextInt();
//			
//			if(choice == 1 ) {
//				ba.createAccount();
//			} else if(choice ==2) {
//				ba.accountList();
//				System.out.println();
//				System.out.println("��ȸ�� �Ϸ��Ͽ����ϴ�.");
//			}else if(choice ==3) {
//				ba.deposit();
//				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
//			}else if (choice == 4) {
//				ba.withdraw();
//				System.out.println("����� �Ϸ�Ǿ����ϴ�.");
//			}else {
//				break;
//			}
//			
//		}
//		
//	
//		
//		
//	}
//
//}
