package chap14;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet 예제
 *   Set 인터페이스의 하위 인터페이스인 SortedSet  구현 클래스
 *   Set : 중복불가.
 *   SortedSet : Set 인터페이스의 하위 인터페이스. 정렬됨.
 */
public class SetEx3 {
	public static void main(String[] args) {
//		TreeSet<String> set = new TreeSet<>();
//		Set<String> set = new TreeSet<>();
		SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car");
		set.add("disc"); set.add("dance");
		set.add("dZZZZ"); set.add("dzzzz");
		set.add("elevator"); set.add("fan");
		set.add("flower");
		System.out.println(set);
		System.out.println("from:" + from + ",to:"+to);
		System.out.println(set.subSet(from,to));
		System.out.println("from:" + from + ",to:"+to+"zzzz");
		System.out.println(set.subSet(from,to+"zzzz"));
		//내림차순 정렬하기.
//		set = new TreeSet<>(new Descending());
//		set = new TreeSet<>(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		});
//jdk 8.0 이후 역순정렬.
//		set = new TreeSet<>(Comparator.reverseOrder());
// set 순서를 대소문자 상관없이 오름차순 정렬하기
		set = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareToIgnoreCase(s2);
			}
		});
// set 순서를 대소문자 상관없이 오름차순 정렬하기 => 람다방식으로 코딩하기		
		set = new TreeSet<>((s1,s2)->s1.compareToIgnoreCase(s2));
		set.add("abc"); set.add("alien");
		set.add("bat"); set.add("azz");
		set.add("car2"); set.add("Car1");
		set.add("disc"); set.add("dance");
		set.add("dZZZZ"); set.add("dzzzz");
		set.add("elevator"); set.add("fan");
		set.add("flower");
		System.out.println(set);
	}
}
class Descending implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
//		return s1.compareTo(s2) * (-1);
		return s2.compareTo(s1);
	}
}
