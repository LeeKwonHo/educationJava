package noticeboard;

import java.util.Scanner;

public class NoticeboardTest {
/*
 *  게시판
 *  프로그램을 시작하면 메뉴를 뿌려줌
 *  1.게시글 보기, 2.게시글 작성, 3. 돌아가기, 4.종료
 *  게시글의 정보 : 번호,제목,내용,작성자,작성일시
 *  
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.게시글 보기 2.게시글 작성 3.돌아가기 4.종료");
		int userChoice = sc.nextInt();
		
		
		
		if(userChoice == 1) {
			//게시글 보여주기
		}else if(userChoice == 2) {
			//게시글 작성하기
		}else if(userChoice == 3) {
			//이전단계로 돌아가기
		}else {
			//종료하기
		}
		
		System.out.println("종료합니다.");
		sc.close();
	}

}
