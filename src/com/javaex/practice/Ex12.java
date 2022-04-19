package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("숫자를 입력하세요");
		
		int p=1;
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			p=p*i;
		}
		System.out.println("결과값: "+p);

		
		sc.close();
	}
}
