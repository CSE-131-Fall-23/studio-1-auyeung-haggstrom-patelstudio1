package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter leap year:");
		int leap = in.nextInt();
		boolean four = (((leap%4 == 0) && !(leap%100 == 0)) || (leap%400 == 0));
		System.out.println(four);
	}

}
