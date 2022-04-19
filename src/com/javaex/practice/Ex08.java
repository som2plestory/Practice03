package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 구구단 출력하기 */
		
		for(int n=1; n<=9; n++) {
			for(int m=2; m<=9; m++) {
				System.out.print(m+"*"+n+"="+m*n+"\t");
			}
			System.out.println("");
		}
		sc.close();
	}
}
