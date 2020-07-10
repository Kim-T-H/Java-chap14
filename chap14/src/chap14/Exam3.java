package chap14;

import java.util.Random;
import java.util.TreeSet;

/*
 * TreeSet ����
 * Lotto��ȣ�� TreeSet�� �̿��Ͽ� ����ϱ�
 * 1~ 45������ ������ ���ڸ� �ߺ����� 6���� ã�Ƽ� �����Ͽ� ����ϱ�
 */
public class Exam3 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>(); 
		Random ball = new Random();
		ball.setSeed(System.currentTimeMillis());
		while(lotto.size() < 6) {
			lotto.add(ball.nextInt(45)+1);
		}
		System.out.println(lotto);
	}
}
