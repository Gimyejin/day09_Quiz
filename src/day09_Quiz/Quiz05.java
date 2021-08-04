package day09_Quiz;

import java.util.Scanner;

public class Quiz05 {
	// 입력받는 기능
	public void insert() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력:");
		int n1 = input.nextInt();
		int result = absolute(n1);
		print(n1, result);
	}

	public int absolute(int n) {
		if (n < 0)
			return (n * -1);
		return n;
	}

	public void print(int n, int n2) {
		System.out.println(n + "의 절대값은 " + n2+"이다");
	}

}
