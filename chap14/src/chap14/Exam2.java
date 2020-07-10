package chap14;

import java.util.HashSet;
import java.util.Set;
/*
 * Student Ŭ���� �����ϱ�
 * 1. ��� ���� : �й�(studno),�̸�(name),����(major)
 * 2. ����޼���: �л� ������ ����ϵ��� toString �������̵� �ϱ�
 * 3. �й��� �̸��� ���� ��� ���� �л����� �ν��ϵ����ϱ�.
 *    => �й��� �̸��� ���� ��� �ߺ��� �л����� �ν�
 * 4. ����Ŭ������ �µ��� ������ ����.   
 */
class Student {
	String studno,name,major;
	public Student(String studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public int hashCode() {
		return studno.hashCode() + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return studno.equals(s.studno) && name.equals(s.name);
		} else return false;
	}
	@Override
	public String toString() {
		return "Student [studno=" + studno + ", name=" + name + ", major=" + major + "]";
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("1234","ȫ�浿","�濵"));
		set.add(new Student("2345","ȫ���","�濵"));
		set.add(new Student("2345","ȫ���","�İ�"));
		set.add(new Student("1234","ȫ�浿","���"));
		set.add(new Student("4567","ȫ�浿","�濵"));
		System.out.println("��� �л� ��:" + set.size()); //3
		System.out.println("����л�:" + set);
	}
}
