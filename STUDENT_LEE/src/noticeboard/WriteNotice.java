package noticeboard;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//글작성 클래스
public class WriteNotice {

	Scanner sc = new Scanner(System.in);
	List list = new ArrayList();

	void setNotice() {
		NoticeBean notice = new NoticeBean();

		System.out.println("게시글 작성");

		System.out.println("글의 제목을 입력해주세요:\n");
		String userTitle = sc.nextLine();
		notice.setNoticeTitle(userTitle);

		System.out.println("글의 내용을 입력해주세요:\n");
		String userContents = sc.nextLine();
		notice.setNoticeContents(userContents);

		System.out.println("작성자를 알려주세요: \n");
		String user = sc.nextLine();
		notice.setNoticeWriter(user);

		notice.setNoticeNumber(list.size() + 1);
		notice.setNoticeWritDate(this.getDate());

		list.add(notice);

		System.out.println("게시글 작성 완료");

	}

	private String getDate() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월dd일 HH시mm분ss초");
		return dateTime.format(formatter);
	}

	int getSize() {
		return this.list.size();
	}

}
