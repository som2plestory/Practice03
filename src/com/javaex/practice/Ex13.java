package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		/* 입력한 숫자까지 누적합계를 구하기 */
		
		System.out.print("숫자를 입력하세요: ");
		int n = sc. nextInt();
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("합계: "+sum);
		
		sc.close();
	}
}
