package day09_Quiz;

import java.util.Scanner;

public class Quiz04 {
	//�Է¹޴� ���
	public void insert() {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է�:");
		int n1=input.nextInt();
		boolean s = check(n1);
		print(n1,s);
	}
	
	public boolean check(int n) {
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			if(count ==1)return true;			
		}return false;
	}
	
	public void print(int n,boolean t) {
		if(t)System.out.println(n+"�� �Ҽ��̴�.");
		else System.out.println(n+"�� �Ҽ��� �ƴϴ�.");
	}
	

}
