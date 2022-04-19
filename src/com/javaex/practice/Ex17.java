package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("숫자를 입력하세요: ");

		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int a=1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println("");
 		}
		
		sc.close();
	}
}
