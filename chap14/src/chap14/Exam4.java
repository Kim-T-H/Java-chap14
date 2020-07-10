package chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. 대한민국(서울),캐나다(오타와),영국(런던),스위스(베른)를 HashMap에 저장하고
 *    화면에서 나라이름을 입력받아 해당 나라의 수도를 출력하는 프로그램 작성하기
 * 2. 등록된 나라가 아닌 경우 "등록된 나라가 아닙니다. 수도를 입력하시겠습니까?(y/Y)"
 *     "수도를 입력하세요" 메세지 출력 후 HashMap 나라이름과 수도이름을 등록하기
 * 3. 프로그램 종료시 map의 정보 출력하기
 *    keySet()
 *    entrySet()       
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		Scanner scan = new Scanner(System.in);
		while(true) {
		   System.out.println("나라이름을 입력하세요(종료:종료)");
		   String nat = scan.next();
		   if(nat.equals("종료")) break;
		   if(map.get(nat) == null) { //등록된 나라가 없는 경우
			  System.out.println("등록된 나라가 아닙니다. 수도를 입력하시겠습니까?(y/Y)");
			  String yn = scan.next();
			  if(yn.equalsIgnoreCase("y")) {
				  System.out.println("수도를 입력하세요");
				  String cap = scan.next();
				  map.put(nat, cap);
			  }
		   }
		   System.out.println(nat+"의 수도는 " + map.get(nat) + "입니다.");
		}
		//keySet()
		for(String k : map.keySet()) {
			System.out.println(k + "의 수도:" + map.get(k));
		}
		//entrySet()
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "의 수도:" + e.getValue());
		}
	}
}

