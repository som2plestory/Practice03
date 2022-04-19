package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		/*
		 * 입력 받은 숫자가 홀수면, 입력 값까지 홀수의 합을 출력 
		 * 입력 받은 숫자가 짝수면, 입력 값까지 짝수의 합을 출력
		 */
		
		int sum=0;
		
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		
		if(n%2==0) {
			for(int i=2; i<=n; i=i+2) {
				sum += i;
			}
		}else {
			for(int i=1; i<=n; i=i+2) {
				sum +=i;
			}
		}
		System.out.println("결과값: "+sum);

		
		sc.close();	
	}
}
