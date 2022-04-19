package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		/*
		 * "1.예금" 선택 후 금액을 입력하면 예금액이 합산됩니다. 
		 * "2.출금" 선택 후 금액을 입력하면 예금액이 차감됩니다. 
		 * "3.잔고" 선택시 현재 잔고가 출력됩니다. 
		 * "4.종료" 선택시 종료됩니다.
		 * "1,2,3,4 이외의 숫자" 다시입력해주세요 메시지가 출력됩니다.
		 */
		
		int now = 0;
		
		while(true) {
			System.out.println("");
			System.out.println("===============================");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("===============================");
			System.out.print("선택> ");
			int n = sc.nextInt();
			if(n==4) {
				System.out.println("프로그램 종료");
				break;
			}else if(n==1) {
				System.out.print("예금액> ");
				int input = sc.nextInt();
				now += input;
			}else if(n==2) {
				System.out.print("출금액> ");
				int output = sc.nextInt();
				now -= output;
			}else if(n==3) {
				System.out.println("잔고액> "+now);
			}else {
				System.out.println("다시입력해주세요");
			}
		}
		sc.close();
	}
}
