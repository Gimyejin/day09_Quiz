package day09_Quiz;

import java.util.Scanner;

public class Quiz03 {
	//�Է¹޴� ���
	public String insert() {
		Scanner input = new Scanner(System.in);
		System.out.println("�� �Է�:");
		int n1=input.nextInt();
		if(check(n1)) three(n1);
		return "";
	}
	
	public boolean check(int n) {
		if(n%3==0) {
			return true;
		}else return false;
	}
	public void three(int n) {
		System.out.println(n+"�� 3�� �����");
	}
	

}
