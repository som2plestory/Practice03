package com.javaex.practice;

import java.util.Scanner; 

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		
		int n, m;
		int i = sc.nextInt();
		for(n=1; n<=i; n++) {
			for(m=1; m<=n; m++) {
				System.out.print(n);
			}
			System.out.println("");
		}
		
		
		sc.close();
	}
}
