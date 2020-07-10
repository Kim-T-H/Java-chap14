package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스 : (Key, 객체) 쌍으로 객체를 모으는 객체.
 * 
 *   객체 추가,수정 : put(키,객체)
 *                등록되어져 있는 키를 다시 추가하면 수정된다.
 *   key를 이용하여 객체 조회 : 객체 = get(키)
 *   key들만 조회 : Set keySet()
 *   value들만 조회 : Collection values()
 *   key,value 쌍이 객체들을 조회 : Set<Map.Entry> entrySet()
 *   객체 제거 : remove(키)
 * 
 * 구현클래스
 *  HashMap, Hashtable, TreeMap
 *  Hashtable은 Collection 프레임워크 이전에 사용되던 클래스. Thread에 safe 하다
 *  HashMap은 Thread에 safe하지 않다.
 */
public class MapEx1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		String[] names = {"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int[] nums = {1234,4567,2350,9870,3456};
		for(int i=0;i<names.length;i++) {
			map.put(names[i],nums[i]);
		}
		System.out.println(map);
		//김삿갓의 전화번호 출력 : 객체 <= map.get(키값)
		System.out.println("김삿갓의 전화번호:" + map.get("김삿갓"));
		//홍길동의 전화번호 출력
		System.out.println("홍길동의 전화번호:" + map.get("홍길동"));
		System.out.println("성춘향의 전화번호:" + map.get("성춘향"));
		//map에서 key들만 조회
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		//map에서 객체 들만 조회
		Collection<Integer> values = map.values();
		System.out.println(values);
		for(Integer v : values) {
			System.out.println(v);
		}
		//map에서 (key,객체)쌍인 객체 
		System.out.println("entrySet() 메서드로 키와 객체 조회하기");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String,Integer> m : entry) {
			System.out.println(m);
			System.out.println(m.getKey() + "=" + m.getValue());
		}
		//홍길동 값 제거하기
		Integer value = map.remove("홍길동");
		System.out.println(value);
		System.out.println(map);
	}
}