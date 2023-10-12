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

		System.out.println("\n글의 제목을 입력해주세요:");
		notice.setNoticeTitle(sc.nextLine());

		System.out.println("\n글의 내용을 입력해주세요:");
		notice.setNoticeContents(sc.nextLine());

		System.out.println("\n작성자를 알려주세요: ");
		notice.setNoticeWriter(sc.nextLine());

		notice.setNoticeNumber(list.size() + 1);
		notice.setNoticeWritDate(getDate());

		list.add(notice);

		System.out.println("게시글 작성 완료");

	}

	void getNoticeList() {
		if (list.size() == 0) {
			System.out.println("======게시물 없음=======");
		}

		for (int i = 0; i < list.size(); i++) {
			NoticeBean notice = (NoticeBean) list.get(i);

			System.out.println("====현재 등록된 게시물====");
			System.out.println("글 번호:" + notice.getNoticeNumber());
			System.out.println("글 제목:" + notice.getNoticeTitle());
			System.out.println("====================");
		}

	}

	void getNoticeContents(int getListNumber) {
		for (int i = 0; i < list.size(); i++) {
			NoticeBean notice = (NoticeBean) list.get(i);

			if (notice.getNoticeNumber() == getListNumber) {
				System.out.println("================");

				System.out.println("글 번호:" + notice.getNoticeNumber());
				System.out.println("제목: \n" + notice.getNoticeTitle());
				System.out.println("내용: \n" + notice.getNoticeContents());
				System.out.println("작성자: " + notice.getNoticeWriter());
				System.out.println("작성일시: " + notice.getNoticeWritDate());

				System.out.println("================");

			}

		}
	}

	void resetNotice(int resetNoticeNumber) {
		if (list.size() == 0) {
			System.out.println("수정할 게시글이 없습니다.");
		}

		for (int i = 0; i < list.size(); i++) {
			NoticeBean notice = (NoticeBean) list.get(i);

			if (notice.getNoticeNumber() == resetNoticeNumber) {
				list.remove(i);
				System.out.println("게시글 수정");

				System.out.println("\n글의 제목을 입력해주세요:");
				notice.setNoticeTitle(sc.nextLine());

				System.out.println("\n글의 내용을 입력해주세요:");
				notice.setNoticeContents(sc.nextLine());

				System.out.println("\n작성자를 알려주세요: ");
				notice.setNoticeWriter(sc.nextLine());

				notice.setNoticeWritDate("수정된 시간" + getDate());

				list.add(notice);

				System.out.println("게시글 작성 완료");
				break;

			}
		}
	}

	void removeNotice(int removeNumber) {
		if (list.size() == 0) {
			System.out.println("삭제할 게시글이 없습니다.");
		}
			
			for (int i = 0; i < list.size(); i++) {
				NoticeBean notice = (NoticeBean) list.get(i);

				if (notice.getNoticeNumber() == removeNumber) {
					list.remove(i);
					break;
			}
		}

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
