package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/*
 *  Properties Ŭ����
 *    Hashtable�� ���� Ŭ����.
 *    <String, String> �� Map Ŭ����. => ���ظ� ǥ�� ��� ����.
 *    �ؽ�Ʈ File ���� ��ü�� ������ ������. 
 */
public class PropertiesEx1 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		System.out.println(pr);
		FileInputStream fis = new FileInputStream("a.properties");
		pr.load(fis); //fis�� �����ϰ� �ִ� ������ ������ Properties ��ü�� �������� �ε�.
		System.out.println(pr);
		System.out.println("�̸�:" + pr.get("name"));
		pr.put("subject", "��ǻ�Ͱ���");
		System.out.println(pr);
		//Properties ��ü�� ������ ���Ͽ� ����
		pr.store(new FileOutputStream("b.properties"),"save");		
	}
}
