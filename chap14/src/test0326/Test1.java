package test0326;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


/*
1.  Student Ŭ���� �����ϱ�
    ������� : �̸�,��������, ��������, ��������
    ����޼��� 
         String toString() : �����������,����,��� ���
         int getTotal() : ������ �� ����
         int compareTo() : �̸� ������������ ���ĵǵ��� ����
2. makeTreeSet �޼��� �ϼ��ϱ�

[���]
�⺻���Ĺ��
[���:����(95),����(85),����(75),����(255),���(85.00), �̸���:����(80),����(95),����(95),����(270),���(90.00), �Ӳ���:����(60),����(75),����(100),����(235),���(78.33), ȫ�浿:����(90),����(80),����(70),����(240),���(80.00)]
�������� �������� ����
[�̸���:����(80),����(95),����(95),����(270),���(90.00), ���:����(95),����(85),����(75),����(255),���(85.00), ȫ�浿:����(90),����(80),����(70),����(240),���(80.00), �Ӳ���:����(60),����(75),����(100),����(235),���(78.33)]
���� ������������ ����
[���:����(95),����(85),����(75),����(255),���(85.00), ȫ�浿:����(90),����(80),����(70),����(240),���(80.00), �̸���:����(80),����(95),����(95),����(270),���(90.00), �Ӳ���:����(60),����(75),����(100),����(235),���(78.33)]
���� ������������ ����
[�̸���:����(80),����(95),����(95),����(270),���(90.00), ���:����(95),����(85),����(75),����(255),���(85.00), ȫ�浿:����(90),����(80),����(70),����(240),���(80.00), �Ӳ���:����(60),����(75),����(100),����(235),���(78.33)]
���� ������������ ����
[�Ӳ���:����(60),����(75),����(100),����(235),���(78.33), �̸���:����(80),����(95),����(95),����(270),���(90.00), ���:����(95),����(85),����(75),����(255),���(85.00), ȫ�浿:����(90),����(80),����(70),����(240),���(80.00)]

 */
class Student implements Comparable<Student>{
	String name;
	int kor, eng, math;	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {		return kor + eng + math;	}
	public String toString() {
		return String.format("%s:����(%d),����(%d),����(%d),����(%d),���(%.2f)",
				name,kor,eng,math,getTotal(),getTotal()/3.0);
	}
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}
public class Test1 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		  list.add(new Student("ȫ�浿",90,80,70));
		  list.add(new Student("���",95,85,75));
		  list.add(new Student("�̸���",80,95,95));
		  list.add(new Student("�Ӳ���",60,75,100));

		  System.out.println("�⺻���Ĺ��");
		  TreeSet<Student> set1 = makeTreeSet(list,null);  
		  System.out.println(set1);
		  
		  System.out.println("�������� �������� ����");
		  Comparator<Student> c = new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o2.getTotal() - o1.getTotal();
				}
		  };
		  TreeSet<Student> set2 = makeTreeSet(list,c);
		  System.out.println(set2);
		  System.out.println("���� ������������ ����");
		  TreeSet<Student> set3 = makeTreeSet(list,new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o2.kor - o1.kor;
				}
		  });
		  System.out.println(set3);
		  System.out.println("���� ������������ ����");
		  TreeSet<Student> set4 = makeTreeSet(list,new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o2.eng - o1.eng;
				}
		  });
		  System.out.println(set4);
		  System.out.println("���� ������������ ����");
		  TreeSet<Student> set5 = makeTreeSet(list,new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o2.math - o1.math;
				}
		  });
		  System.out.println(set5);
		 }
	static TreeSet<Student> makeTreeSet(List<Student> list, Comparator<Student> c) {
		TreeSet<Student> set = new TreeSet<>(c);
//		for(Student s : list) set.add(s);
		set.addAll(list);
		return set;
	}
}
