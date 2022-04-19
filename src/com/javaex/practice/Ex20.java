package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 숨겨진 숫자를 맞추는 게임입니다.
		 * 프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다.
		 * (1~100 사이의 랜덤한 숫자를 구할 수 없으니 코드로 임의의 숫자를 정한 후 
		 * 코딩하며, 숫자를 변경해서 테스트를 합니다.)
		 * 
		 * 사용자가 입력한 숫자가 결정된 숫자보다 높으면 "더 낮게" 출력
		 * 사용자가 입력한 숫자가 결정된 숫자보다 낮으면 "더 낮게" 출력 되며
		 * 정답을 맞춘 경우 "맞았습니다." 출력됩니다.
		 * 게임을 반복하기 위해 Y/N이라 묻고 N인 경우 종료됩니다.
		 * (Y인 경우 다시 게임이 시작됩니다.) 
		 */
		
		String answer="N";
		int r = 29; //random
		
		System.out.println("================================");
		System.out.println("\t[숫자맞추기게임 시작]\t");
		System.out.println("================================");
		while(true) { 
			System.out.print(">>");
			int i = sc.nextInt();
			if(i==r) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니다?(Y/N) >>");
				String a = sc.next();
				if(a.equals(answer)) {
					System.out.println("================================");
					System.out.println("\t[숫자맞추기게임 시작]\t");
					System.out.println("================================");
				}else {
				System.out.println("================================");
				System.out.println("\t[숫자맞추기게임 종료]\t");
				System.out.println("================================");
				break;
				}
			}else if(i>r) {
				System.out.println("더 낮게");
			}else {
				System.out.println("더 높게");
			}
		}
		sc.close();
	}
}
