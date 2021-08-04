package day09_Quiz;

import java.util.Scanner;

public class Quiz02 {
	// 입력받는 기능
	public void insert() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력:");
		int n1 = input.nextInt();
		String s = check(n1);
		print(n1, s);
	}

	public String check(int n) {
		if (n % 2 == 0) {
			return "짝수";
		} else
			return "홀수";

	}

	public void print(int n, String s) {
		System.out.println(n + "은 " + s + "이다");
	}

}
