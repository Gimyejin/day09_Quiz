package day09_Quiz;

import java.util.Scanner;

public class Quiz01 {
	//입력받는 기능
		public void insert() {
			Scanner input = new Scanner(System.in);
			System.out.println("두 수 입력:");
			int n1=input.nextInt();
			int n2=input.nextInt();
			int max =big(n1,n2);
			print(max);
		}
		
		public int big(int n,int n2) {
			int temp=n;
			if(n<n2) {
				temp=n2;
			}
			return temp;
		}
		public void print(int n) {
			System.out.println("큰 수: "+n);
		}
}
