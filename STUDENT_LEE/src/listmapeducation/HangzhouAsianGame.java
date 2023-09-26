package listmapeducation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HangzhouAsianGame {

	// 리스트안에 맵이 있다, 리스트는 배열, 각각의 키와 벨류를 가진게 맵
	// 유틸 안에 컬렉션이 있음
	List eventlist;// 리스트 인터페이스의 다형성을 활용

	public HangzhouAsianGame() {
		eventlist = new ArrayList(); // E는 엘리먼트의 약자 구성요소라는 뜻
		// 배열이 하나 만들어짐
	}

	void setEsports() {
		List eslist = new ArrayList();
		
		Map esmap = new HashMap();// 해쉬맵은 그리드로 생각(엑셀)
		// 해쉬맵도 맵의 인터페이스를 사용하기떄문에 다형성 적용가능
		
		esmap.put("date", "9월 24일 (일)");// 앞이 키, 뒤가 벨류
		esmap.put("time", "10:00");// 앞이 키, 뒤가 벨류
		esmap.put("title", "FIFA온라인");// 앞이 키, 뒤가 벨류
		// 맵은 데이터베이스 느낌으로
		eslist.add(esmap);// add로 맵을 담으면 순서대로 담김 , map은 순서가 없음

		esmap = new HashMap();// 해쉬맵은 그리드로 생각(엑셀)
		// 해쉬맵도 맵의 인터페이스를 사용하기떄문에 다형성 적용가능
		
		esmap.put("date", "테스트날짜");// 앞이 키, 뒤가 벨류
		esmap.put("time", "테스트시간");// 앞이 키, 뒤가 벨류
		esmap.put("title", "테스트종목");// 앞이 키, 뒤가 벨류
		// 맵은 데이터베이스 느낌으로
		eslist.add(esmap);
		
		Map eventmap = new HashMap();
		eventmap.put("Esports", eslist);

		eventlist.add(eventmap);

	}

	void setCycle() {
		Map cyclemap = new HashMap();// 해쉬맵은 그리드로 생각(엑셀)
		// 해쉬맵도 맵의 인터페이스를 사용하기떄문에 다형성 적용가능
		cyclemap.put("date", "10월 1일 (일)");// 앞이 키, 뒤가 벨류
		cyclemap.put("time", "10:00");// 앞이 키, 뒤가 벨류
		cyclemap.put("title", "남자 사이클 1차예선");// 앞이 키, 뒤가 벨류
		// 맵은 데이터베이스 느낌으로
		List cyclelist = new ArrayList();
		cyclelist.add(cyclemap);// add로 맵을 담으면 순서대로 담김 , map은 순서가 없음

		Map eventmap = new HashMap();
		eventmap.put("cycle", cyclelist);

		eventlist.add(eventmap);

	}

	List search(String event) {// 이벤트리스트를 꺼내려면 오브젝트로 들어가있다함
		List retList = null;
		outter : for (int i = 0; i < eventlist.size(); i++) {
			// 리스트는 사이즈로 지정
			Map map = (Map) eventlist.get(i);
			// 맵은 키값을 알아야 불러옴, 키값은 고유하기 때문에 Set해야함
			Set set = map.keySet();
			// 키도 여러개이기 때문에 포문으로 걸러줘야함
			Iterator ite = set.iterator();
			while (ite.hasNext()) {
				String name = (String) ite.next();
				if (event.equals(name)) {
					retList = (List) map.get(name);
					break outter;
				}
			}
		}
		return retList;
	}

}
