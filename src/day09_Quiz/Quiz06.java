package day09_Quiz;

import java.util.Scanner;

public class Quiz06 {
	// �Է¹޴� ���
	public void insert() {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է�:");
		int n1 = input.nextInt();
		print(n1);
		check(n1);
	}

	public void check(int n) {
		while(true) {
			int temp=n%10;
			n=n/10;
			print(temp);
			if(n==0)break;
		}
	}

	public void print(int n) {
		System.out.println(n);
	}

}
