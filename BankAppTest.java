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
//		System.out.println("=    은행업무관리시스템      =");
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
//				System.out.println("조회를 완료하였습니다.");
//			}else if(choice ==3) {
//				ba.deposit();
//				System.out.println("예금이 완료되었습니다.");
//			}else if (choice == 4) {
//				ba.withdraw();
//				System.out.println("출금이 완료되었습니다.");
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
