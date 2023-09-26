package listmapeducation;

import java.util.List;
import java.util.Map;

public class HangzhouAsianGameTest {

	public static void main(String[] args) {
		HangzhouAsianGame hag = new HangzhouAsianGame();
		
		hag.setEsports();
		hag.setCycle();

		List list = hag.search("Esports");

		for(int i = 0; i < list.size(); i++) {
			Map map = (Map)list.get(i);
			System.out.println("날짜"+ map.get("date"));
			System.out.println("시간"+ map.get("time"));
			System.out.println("제목"+ map.get("title"));
			System.out.println("----------------------------------");
		}
	}

}
