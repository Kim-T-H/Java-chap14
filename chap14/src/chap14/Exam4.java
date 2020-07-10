package chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. ���ѹα�(����),ĳ����(��Ÿ��),����(����),������(����)�� HashMap�� �����ϰ�
 *    ȭ�鿡�� �����̸��� �Է¹޾� �ش� ������ ������ ����ϴ� ���α׷� �ۼ��ϱ�
 * 2. ��ϵ� ���� �ƴ� ��� "��ϵ� ���� �ƴմϴ�. ������ �Է��Ͻðڽ��ϱ�?(y/Y)"
 *     "������ �Է��ϼ���" �޼��� ��� �� HashMap �����̸��� �����̸��� ����ϱ�
 * 3. ���α׷� ����� map�� ���� ����ϱ�
 *    keySet()
 *    entrySet()       
 */
public class Exam4 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("���ѹα�", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "����");
		Scanner scan = new Scanner(System.in);
		while(true) {
		   System.out.println("�����̸��� �Է��ϼ���(����:����)");
		   String nat = scan.next();
		   if(nat.equals("����")) break;
		   if(map.get(nat) == null) { //��ϵ� ���� ���� ���
			  System.out.println("��ϵ� ���� �ƴմϴ�. ������ �Է��Ͻðڽ��ϱ�?(y/Y)");
			  String yn = scan.next();
			  if(yn.equalsIgnoreCase("y")) {
				  System.out.println("������ �Է��ϼ���");
				  String cap = scan.next();
				  map.put(nat, cap);
			  }
		   }
		   System.out.println(nat+"�� ������ " + map.get(nat) + "�Դϴ�.");
		}
		//keySet()
		for(String k : map.keySet()) {
			System.out.println(k + "�� ����:" + map.get(k));
		}
		//entrySet()
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "�� ����:" + e.getValue());
		}
	}
}

