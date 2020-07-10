package chap14;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * LinkedHashSet : 중복 불가 , 순서 유지.
 * new ArrayList(Set) : Set 객체를 List 객체로 변경.
 */
public class SetEx5 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);set.add(1);
		set.add(3);set.add(2);
		set.add(4);set.add(5);
		set.add(4);set.add(5);
		System.out.println(set);
		List<Integer> list = new ArrayList<>(set);
		System.out.println(list.get(0));
	}
}
