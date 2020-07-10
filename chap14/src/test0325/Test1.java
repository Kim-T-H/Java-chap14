package test0325;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 1 ~ 99까지의 정수를 입력받아서 TreeSet에 저장하고, 0 을 입력하면 입력을 종료한다. 
 * 입력된 값을 정렬하여 출력하기.
   1 ~ 99 까지의 숫자가 아닌 경우 TreeSet에서 저장하지 말것.
 * 
 * set1 오름차순 정렬되도록 출력.
 * set2 내림차순 정렬되도록 출력하기. 
 */
public class Test1 {
 public static void main(String[] args) {
     TreeSet<Integer> set1 = new TreeSet<Integer>();
//    TreeSet<Integer> set2 = new TreeSet<Integer>(Comparator.reverseOrder());
     TreeSet<Integer> set2 = new TreeSet<Integer>(new Comparator<Integer>() {
 		@Override
 		public int compare(Integer i1, Integer i2) {
 			return i2.compareTo(i1);
 		}
      });
     Scanner scan = new Scanner(System.in);
     System.out.println("1부터 99까지의 숫자를 입력하세요 (종료 : 0)");
     while(true) {
    	 int num = scan.nextInt();
    	 if(num == 0) break;
    	 if(num < 1 || num > 99) continue;
    	 set1.add(num);
    	 set2.add(num);
     }
     System.out.println(set1);
     System.out.println(set2);
 }
}
