package test0325;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성
  
  [결과]
3등 복권 추첨합니다.
945
123
6
2등 복권 추첨합니다.
611
404
1등 복권 추첨합니다.
797

*** 복권 추첨 결과 ***

1등:797,
2등:404,611,
3등:6,123,945,  

 */
public class Test2 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while (set.size() < 6) {
			if (set.size() == 0)
				System.out.println("3등 복권 추첨합니다.");
			else if (set.size() == 3)
				System.out.println("2등 복권 추첨합니다.");
			else if (set.size() == 5)
				System.out.println("1등 복권 추첨합니다.");
//			int num = (int) (Math.random() * 1000) + 1;
			int num = rand.nextInt(1000) + 1;
			if (set.add(num)) { //중복된 경우 false
				System.out.println(num);
			}
		}
		System.out.println("*** 복권 추첨 결과 ***");
		List<Integer> list = new ArrayList<>(set);
		for(int i=list.size()-1;i>=0;i--) {
			if(i == list.size()-1)
				System.out.println("1등:" + list.get(i));
			else if (i == list.size()-2)
				System.out.print("2등:" + list.get(i) + ",");
			else if (i< list.size()-2 && i>=3)
				System.out.print(list.get(i) + ",");
			else if(i==2) 
				System.out.print("\n3등:" + list.get(i)+ ",");
			else
				System.out.print(list.get(i)+ ",");
		}
//		System.out.println("1등:" + list.subList(5, 6));
//		System.out.println("2등:" + list.subList(3, 5));
//		System.out.println("3등:" + list.subList(0, 3));
	}
}
