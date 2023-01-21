package com.Mp;

import java.util.Scanner;

public class TNEB {
	public static void main(String[] args) {
		long units;
		Scanner a = new Scanner(System.in);
		System.out.println("UNITS USED : ");
		units=a.nextLong();
		double bill_amount=0;
		if(units<100)
			bill_amount=units*1.50;
		else if(units<300)
			bill_amount=100*1.50+(units-100)*2;
		else if(units>300)
		bill_amount=100*1.50+200+(units-300)*3;
		System.out.println("EB BILL : " +bill_amount);
	}

}
