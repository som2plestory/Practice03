package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		/* 1부터 입력한 숫자까지의 5의 배수의 개수와 합을 출력 */
		
		System.out.print("숫자를 입력하세요: ");

		int c=0, s=0;
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%5==0) {
				c++;
				s +=i;
			}
 		}
		System.out.println("5의 배수의 개수: "+c);
		System.out.println("5의 배수의 합: "+s);
		
		sc.close();
	}
}
