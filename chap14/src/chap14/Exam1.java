package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ȭ�鿡�� Ȧ������ ���ڸ� �Է¹޾Ƽ� �Է¹��� ������ ��հ� �߰��� ����ϱ�
 * 
 *  10 40 30 60 30
 *  
 *  10 30 30 40 60
 *
   Ȧ������ ���ڸ� �Է��ϼ���(���� : 999)
   5 6 2 4 5 6 7 999
    �Է� ������ :[5, 6, 2, 4, 5, 6, 7]
    �Է� ������ �� :35
  [2, 4, 5, 5, 6, 6, 7]
   �Է� ������ �߰� �� :5
   �Է� ������ ��� �� :5.0
*/
public class Exam1 {
	public static void main(String[] args) {
		System.out.println("Ȧ������ ���ڸ� �Է��ϼ���(���� : 999)");
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		List<Integer> list = new ArrayList<>();
		while(true) {
			int num = scan.nextInt();
			if(num == 999) break;
			list.add(num);
			sum += num;
		}
		//¦���� �Է½� ������ �Էµ� ���ڸ� �����ϱ�
		if(list.size()%2==0) list.remove(list.size()-1);
		System.out.println("�Է� ������:" + list);
		System.out.println("�Էµ������� ��:" + sum);
		Collections.sort(list);
		System.out.println("���ĵ� ������:" + list);
		System.out.println("�߰��� :" + list.get(list.size()/2));
		System.out.println("��� :" + sum/list.size());		
	}
}
