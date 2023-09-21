package ifelseeducation;

import java.util.Scanner;

public class RandomExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int random = (int) (Math.random()*3) +1;
		
		
		System.out.println("======================");
		System.out.println("====가위, 바위, 보 컴까기====");
		System.out.println("======================");
		System.out.println("가위는 1, 바위는 2, 보는 3 중에 택");
		int user = sc.nextInt();
		
		//유저가 가위를 입력
		if(user == 1) {
			System.out.println("가위를 내셧습니다");
			if(random == 1) {
				System.out.println("컴: 가위\n");
				System.out.println("비김");
			}
			if(random == 2) {
				System.out.println("컴: 바위\n");
				System.out.println("패배");
			}
			if(random == 3) {
				System.out.println("컴: 보\n");
				System.out.println("승리");
			}
		}
		//유저가 바위를 입력
		if(user == 2) {
			System.out.println("바위를 내셧습니다");
			if(random == 1) {
				System.out.println("컴: 가위\n");
				System.out.println("승리");
			}
			if(random == 2) {
				System.out.println("컴: 바위\n");
				System.out.println("비김");
			}
			if(random == 3) {
				System.out.println("컴: 보\n");
				System.out.println("패배");
			}
		}
		//유저가 보자기를 입력
		if(user == 3) {
			System.out.println("보를 내셧습니다");
			if(random == 1) {
				System.out.println("컴: 가위\n");
				System.out.println("패배");
			}
			if(random == 2) {
				System.out.println("컴: 바위\n");
				System.out.println("승리");
			}
			if(random == 3) {
				System.out.println("컴: 보\n");
				System.out.println("비김");
			}
		}else if(user >=4) {
			System.out.println("잘못된 숫자입니다, 패배로 간주합니다");
		}
		
		
		sc.close();
	}
		
		//가위,바위,보 를 만들기
		//가위는 1 바위는 2 보는 3
		
		
}


