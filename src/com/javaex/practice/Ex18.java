package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
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
		for(int i=1; i<n; i++) {
			for(int a=0; a<i+1; a++) {
				System.out.print("*");
			}
			System.out.println("");
 		}
		
		sc.close();
	}

}
