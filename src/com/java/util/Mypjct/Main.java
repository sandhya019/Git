package com.java.util.Mypjct;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1,a2,a3,min;

		Scanner scan=new Scanner(System.in);
		System.out.println("enter distace to shop1");
		a1=scan.nextInt();
		System.out.println("enter distance to shop2");
		a2=scan.nextInt();
		System.out.println("enter distance between two shops");
		a3=scan.nextInt();

		int a=2*(a1+a2);
		int b=2*(a2+a3);
		int c=2*(a1+a3);
        
		
		if(a<=b && a<=c){
		min=a;
		System.out.println("min distance is :"+min);
		}else
		if(b<=a && b<=c){
		min=b;
		System.out.println("min distance is :"+min);
		}else
		{
		min=c;
		System.out.println("min distance is :"+min);
		}
		
		
	}

}
