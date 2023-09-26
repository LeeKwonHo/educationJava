package listmapeducation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeeList {

	List list;

	public LeeList() {
		list = new ArrayList();
	}
	
	void setLee() {
		List listLee = new ArrayList();
		
		Map map = new HashMap();
		
		map.put("신장", "178");
		map.put("나이", "23");
		map.put("족적", "270");
		map.put("눈", "2개");
		map.put("입", "1개");
		
		listLee.add(map);
		
		Map leeMap = new HashMap();
		
		leeMap.put("개인정보", listLee);
		
		list.add(leeMap);
		
	}
	
	List getLee(String nameLee) {
		List retList = null;
		outter : for (int i = 0; i < list.size(); i++) {
			Map map = (Map)list.get(i);
			Set set = map.keySet();
			Iterator ite = set.iterator();
			while(ite.hasNext()) {
				String name = (String)ite.next();
				if(nameLee.equals(name)) {
					retList = (List)map.get(name); 
					break outter;
				}
			}
		}return retList; 
	}























}
