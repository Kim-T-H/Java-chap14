package chap14;

import java.util.List;
import java.util.Vector;

/*
 * Vector 예제 : Collection 프레임워크 이전 클래스
 *              List 인터페이스의 구현 클래스
 *              이전사용된 메서드와 List를 구현한 메서드가 함께 존재.
 */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
//		List<Double> list = new Vector<>();
		list.add(0.3);list.add(Math.PI);
		list.addElement(5.0); //구 메서드. Vector타입 참조변수로만 사용가능
		for(Double d : list) {
			System.out.println(d);
		}
		double num = 5.0;
		int index = list.indexOf(num);
		if(index < 0) {
			System.out.println(num + "은 list에 없습니다.");
		} else {
			System.out.println(num + "의 위치 : " + index);
		}
		num = 0.3;
		System.out.println(list.indexOf(num));
		if(list.contains(num)) {
			list.removeElement(num); //구 메서드. Vector타입 참조변수로만 사용가능
			System.out.println(num + "삭제됨");
		}
		list.remove(5.0);
		System.out.println(list);
	}
}
