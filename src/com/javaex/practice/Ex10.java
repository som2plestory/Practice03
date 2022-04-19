package com.javaex.practice;


import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
/*		int n = 0;
		int i = 0;
		while(i<5) {
			System.out.print("숫자: ");
			int n1 = sc.nextInt();
			if(n>n1) {
				n=n;
			}else {
				n=n1;
			}
			i++;
		}	
		System.out.println("최대값은: " + n +"입니다.");
		
		
		sc.close();*/
		
		
		int n = 0;
		for(int i=0; i<5; i++ ) {
			System.out.print("숫자: ");
			int n1 = sc.nextInt();
			if(n>n1) {
				n=n;
			}else {
				n=n1;
			}
		}
		System.out.println("최대값은: " + n +"입니다.");
		sc.close();
	}
}
