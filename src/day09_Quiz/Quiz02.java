package day09_Quiz;

import java.util.Scanner;

public class Quiz02 {
	// �Է¹޴� ���
	public void insert() {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է�:");
		int n1 = input.nextInt();
		String s = check(n1);
		print(n1, s);
	}

	public String check(int n) {
		if (n % 2 == 0) {
			return "¦��";
		} else
			return "Ȧ��";

	}

	public void print(int n, String s) {
		System.out.println(n + "�� " + s + "�̴�");
	}

}
