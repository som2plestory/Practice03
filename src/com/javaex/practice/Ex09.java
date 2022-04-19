package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int n=1; n<=10; n++) {
			for(int m=n; m<n+10; m++) {
				System.out.print(m+"\t");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
