package chap14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Stack Ŭ���� : LIFO(Last in First out)
 *              List ��ü.
 *              Vector Ŭ������ ���� Ŭ����
 *    push(Object o) : ��ü�� stack�� ����. �߰�          
 *    Object pop()   : stack�� ����� ��ü�� ����. ����.          
 *    Object peek()  : stack�� ����� ��ü�� ��ȸ.    
 *    
 * Queue �������̽� : FIFO (First in First out)
 *                 LinkedList Ŭ������ ���� Ŭ������.         
 *    offer(Object) : ��ü�� queue�� ����. �߰� 
 *    Object poll() : ��ü�� queue���� ����. ����
 *    Object peek() : queue�� ����� ��ü�� ��ȸ.    
 */
public class StackQueueEx1 {
	public static void main(String[] args) {
		String cars[] = {"�ҳ�Ÿ","�׷���","SM5","K9"};
		Stack<String> stack = new Stack<>();
		for(String s : cars) stack.push(s);
		System.out.println("���ÿ� ����� ��ü�� ����:"+stack.size());
		System.out.println(stack.peek());
		System.out.println("���ÿ� ����� ��ü�� ����:"+stack.size());
		System.out.println(stack.pop());
		System.out.println("���ÿ� ����� ��ü�� ����:"+stack.size());
		Queue<String> queue = new LinkedList<>();
		for(String s : cars) queue.offer(s);
		System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
		System.out.println(queue.peek());
		System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
		System.out.println(queue.poll());
		System.out.println("ť�� ����� ��ü�� ����:" + queue.size());		
	}
}
