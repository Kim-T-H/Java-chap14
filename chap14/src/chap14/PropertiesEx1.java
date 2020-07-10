package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/*
 *  Properties 클래스
 *    Hashtable의 하위 클래스.
 *    <String, String> 인 Map 클래스. => 제넥릭 표현 사용 안함.
 *    텍스트 File 에서 객체로 저장이 가능함. 
 */
public class PropertiesEx1 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		System.out.println(pr);
		FileInputStream fis = new FileInputStream("a.properties");
		pr.load(fis); //fis가 참조하고 있는 파일의 내용을 Properties 객체의 내용으로 로드.
		System.out.println(pr);
		System.out.println("이름:" + pr.get("name"));
		pr.put("subject", "컴퓨터공학");
		System.out.println(pr);
		//Properties 객체의 내용을 파일에 저장
		pr.store(new FileOutputStream("b.properties"),"save");		
	}
}
