package listmapeducation;

import java.util.List;
import java.util.Map;

public class LeeKwonHo {

	public static void main(String[] args) {

		LeeList lee = new LeeList();
		lee.setLee();

		List list = lee.getLee("개인정보");

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				Map map = (Map) list.get(i);
				System.out.println("신장" + map.get("신장"));
				System.out.println("나이" + map.get("나이"));
				System.out.println("족적" + map.get("족적"));
				System.out.println("눈" + map.get("눈"));
				System.out.println("입" + map.get("입"));

			}

		} else {
			System.out.println("결과가 없습니다");
		}
	}

}
