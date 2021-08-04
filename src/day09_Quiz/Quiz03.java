package day09_Quiz;

import java.util.Scanner;

public class Quiz03 {
	//입력받는 기능
	public String insert() {
		Scanner input = new Scanner(System.in);
		System.out.println("수 입력:");
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
		System.out.println(n+"은 3의 배수다");
	}
	

}
