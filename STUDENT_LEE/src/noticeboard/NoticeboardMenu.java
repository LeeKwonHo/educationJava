package noticeboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoticeboardMenu {
// 사용자에게 메뉴 선택을 물어봄 
// 글 작성, 글 읽기, 돌아가기, 종료
	//메뉴를 불러올시 물어보는 출력 메소드
	Scanner sc = new Scanner(System.in);
	NoticeboardBean notice = new NoticeboardBean();
	
	List list;
	
	public NoticeboardMenu() {
		list = new ArrayList();
	}
	//글 작성을 선택했을때 메소드
	void setNotice(int setNotice) {
		//작성된 글을 리스트에 넣어줘야함
		List noticeList = new ArrayList();
		
		System.out.println("제목을 입력하시오: ");
		String userInPut = sc.nextLine();
		notice.setNoticeName(userInPut);;
		
		System.out.println("내용을 작성하시오: ");
		String userNotice = sc.nextLine();
		notice.setNoticeDetail(userNotice);
		
		
		
		noticeList.add(notice);
		
		list.add(noticeList);
		
	}
	
	//글 읽기를 선택했을때 메소드
	void getNotice(int getNotice) {
		//글을 리스트에서 불러와야함
		System.out.println("게시글 번호: ");
		notice.getNoticeNum();
		
		System.out.println("게시글 제목: ");
		notice.getNoticeName();
		
		System.out.println("게시글 내용: ");
		notice.getNoticeDetail();
		
		System.out.println("게시글 작성일자: ");
		notice.getNoticeDate();
		
	}
	
	//돌아가기를 선택했을때 메소드
	void getReturn(int getReturn) {
		//이전단계로 돌려보내주기
		
	}
	
	//종료 선택시 메소드
	void powerOff(int powerOff) {
		//끝
		
	}
}
