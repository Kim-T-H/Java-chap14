package test0325;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 1 ~ 99������ ������ �Է¹޾Ƽ� TreeSet�� �����ϰ�, 0 �� �Է��ϸ� �Է��� �����Ѵ�. 
 * �Էµ� ���� �����Ͽ� ����ϱ�.
   1 ~ 99 ������ ���ڰ� �ƴ� ��� TreeSet���� �������� ����.
 * 
 * set1 �������� ���ĵǵ��� ���.
 * set2 �������� ���ĵǵ��� ����ϱ�. 
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
     System.out.println("1���� 99������ ���ڸ� �Է��ϼ��� (���� : 0)");
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
