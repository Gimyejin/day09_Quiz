package day09_Quiz;

import java.util.Scanner;

public class Quiz05 {
	// �Է¹޴� ���
	public void insert() {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է�:");
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
		System.out.println(n + "�� ���밪�� " + n2+"�̴�");
	}

}
