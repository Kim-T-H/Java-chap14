package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap 예제
 * 
 */
public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<String,String> map = new TreeMap<>();
		map.put("대한민국", "서울");
		map.put("영국", "런던");
		map.put("캐나다", "오타와");
		map.put("스위스", "베른");
		System.out.println(map);
		System.out.println("나라이름의 내림차순 정렬 하기");
		map = new TreeMap<>(Comparator.reverseOrder());
		map.put("대한민국", "서울");
		map.put("영국", "런던");
		map.put("캐나다", "오타와");
		map.put("스위스", "베른");
		System.out.println(map);
		System.out.println("수도이름 순으로 정렬 하기");
		map = new TreeMap<>();
		map.put("대한민국", "서울");
		map.put("영국", "런던");
		map.put("캐나다", "오타와");
		map.put("스위스", "베른");
		map.put("과테말라", "과테말라시티");
		
		Set <Map.Entry<String, String>> entry = map.entrySet();
		List<Map.Entry<String, String>> list = new ArrayList<>(entry);
		Collections.sort(list,new Comparator<Map.Entry<String, String>>() {
			@Override
			public int compare
			    (Map.Entry<String, String> m1, Map.Entry<String, String> m2) {
				return m1.getValue().compareTo(m2.getValue());
			}
			
		});
		System.out.println(list);
	}
}
