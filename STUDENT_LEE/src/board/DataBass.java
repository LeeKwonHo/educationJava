package board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBass {
	// 리스트에 데이터를 넣기
	private List list = new ArrayList();

	void showList() {
		if (0 == list.size()) {
			System.out.println("====게시물 없음====");
		}
		
		for (int i = 0; i < list.size(); i++) {
			Board board = (Board) list.get(i);
			
			System.out.println("번호: " + board.getNumber());
			System.out.println("제목: " + board.getTitle());
			System.out.println("내용: " + board.getContents());
			System.out.println("작성자: " + board.getWriter());
			System.out.println("작성일시: " + board.getDate());
			System.out.println("-----------------------");
		}
	}

	void writeBoard() {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();

		System.out.println("제목을 입력");
		board.setTitle(sc.nextLine());

		System.out.println("내용을 입력");
		board.setContents(sc.nextLine());

		System.out.println("작성자 입력");
		board.setWriter(sc.nextLine());

		board.setNumber(list.size() + 1);
		board.setDate(getDate());

		list.add(board);

	}

	private String getDate() {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd일MM월yyyy HH시mm분ss초");
		return dateTime.format(formatter);
	}

}
