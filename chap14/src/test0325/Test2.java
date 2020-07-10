package test0325;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
���� ����� �������� ���α׷��� �ۼ��Ͻÿ�
 1 ~ 1000�������� ��ȣ�� ������ ������ �ִ�.
 1�� 1��, 2�� 2��, 3�� 3�� �� ��÷�ϴ� ���α׷� �ۼ��ϱ�
  �� ��÷�� 3����� ��÷�ϰ�, ��÷��ȣ�� �ߺ��Ǹ� �ȵȴ�.
  ��÷�� ��ȣ�� ������ ���̹Ƿ� ���� ���� ���� �Ҷ� ���� �ٸ���.

  LinkedHashSet : ��������, �ߺ��Ұ�
  Random
  new ArrayList(Set) : Set ��ü�� List��ü�� ����
  
  [���]
3�� ���� ��÷�մϴ�.
945
123
6
2�� ���� ��÷�մϴ�.
611
404
1�� ���� ��÷�մϴ�.
797

*** ���� ��÷ ��� ***

1��:797,
2��:404,611,
3��:6,123,945,  

 */
public class Test2 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		while (set.size() < 6) {
			if (set.size() == 0)
				System.out.println("3�� ���� ��÷�մϴ�.");
			else if (set.size() == 3)
				System.out.println("2�� ���� ��÷�մϴ�.");
			else if (set.size() == 5)
				System.out.println("1�� ���� ��÷�մϴ�.");
//			int num = (int) (Math.random() * 1000) + 1;
			int num = rand.nextInt(1000) + 1;
			if (set.add(num)) { //�ߺ��� ��� false
				System.out.println(num);
			}
		}
		System.out.println("*** ���� ��÷ ��� ***");
		List<Integer> list = new ArrayList<>(set);
		for(int i=list.size()-1;i>=0;i--) {
			if(i == list.size()-1)
				System.out.println("1��:" + list.get(i));
			else if (i == list.size()-2)
				System.out.print("2��:" + list.get(i) + ",");
			else if (i< list.size()-2 && i>=3)
				System.out.print(list.get(i) + ",");
			else if(i==2) 
				System.out.print("\n3��:" + list.get(i)+ ",");
			else
				System.out.print(list.get(i)+ ",");
		}
//		System.out.println("1��:" + list.subList(5, 6));
//		System.out.println("2��:" + list.subList(3, 5));
//		System.out.println("3��:" + list.subList(0, 3));
	}
}
