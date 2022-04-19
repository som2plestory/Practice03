package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		/* 입력한 숫자까지 계산식과 누적합 출력 */
		
		System.out.print("숫자를 입력하세요: ");
		int n = sc. nextInt();
		int sum = 0;
		for(int i=1; i<n; i++) {
			System.out.print(i+"+");
		}
		System.out.println(n);
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println("합계: "+sum);
		
		sc.close();
	}
}
