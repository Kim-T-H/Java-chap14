package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 홀수개의 숫자를 입력받아서 입력받은 숫자의 평균과 중간값 출력하기
 * 
 *  10 40 30 60 30
 *  
 *  10 30 30 40 60
 *
   홀수개의 숫자를 입력하세요(종료 : 999)
   5 6 2 4 5 6 7 999
    입력 데이터 :[5, 6, 2, 4, 5, 6, 7]
    입력 숫자의 합 :35
  [2, 4, 5, 5, 6, 6, 7]
   입력 숫자의 중간 값 :5
   입력 숫자의 평균 값 :5.0
*/
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("홀수개의 숫자를 입력하세요(종료 : 999)");
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		List<Integer> list = new ArrayList<>();
		while(true) {
			int num = scan.nextInt();
			if(num == 999) break;
			list.add(num);
			sum += num;
		}
		//짝수개 입력시 마지막 입력된 숫자를 삭제하기
		if(list.size()%2==0) list.remove(list.size()-1);
		System.out.println("입력 데이터:" + list);
		System.out.println("입력데이터의 합:" + sum);
		Collections.sort(list);
		System.out.println("정렬된 데이터:" + list);
		System.out.println("중간값 :" + list.get(list.size()/2));
		System.out.println("평균 :" + sum/list.size());		
	}
}
