package DataStructure;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��4�� ����10:11:36 
 * ��˵�� 
 */
/*
 * 
 * @ClassName:     Node
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2016��3��5�� ����8:05:58
 *
 * @param <E>
 */


public class MyStack<E> {
	class Node<E>{
		Node<E> next = null;
		E data;
		public Node(E data){this.data = data;}
	}
	public Node<E> top = null;
	/**
	 * 
	 * @Title: isEmpty
	 * @Description: TODO(ջ�����в���ֻ���Ƕ�ջ���ڵ���в��������ԣ���ջ��ָ��Ϊ�յ�ʱ��˵��ջΪ��)
	 * @param: @return   
	 * @return: boolean   
	 * @throws
	 */
	public boolean isEmpty(){
		return top == null;
	}
	/**
	 * 
	 * @Title: push
	 * @Description: TODO(ѹ��ջ����ס�ϸ�ջ��ָ��)
	 * @param: @param data   
	 * @return: void   
	 * @throws
	 */
	public void push(E data){
		Node<E> addNode = new Node<E>(data);
		addNode.next = top;
		top = addNode;//ջ��ָ���ϸ���ÿ����ջһ���ڵ㣬��ջ��ָ��ָ��ǰ��ջ�ڵ㡣
	}
	/**
	 * 
	 * @Title: pop
	 * @Description: TODO(����ջ����ס�³�ջ��ָ��)
	 * @param: @return   
	 * @return: E   
	 * @throws
	 */
	public E pop(){
		if(isEmpty())return null;//��ס��null�����Ƕ��󣬲�����java.lang.Object��Ҳ����ʵ�����롰����ͬ��������ʾ�������ַ�������Ϊ0���ַ�����
		E data = top.data;
		top = top.next;//ջ��ָ���³���
		return data;
	}
	/**
	 * 
	 * @Title: peek
	 * @Description: TODO(����ջ���ڵ����ݣ���סһ��Ҫ�ж�ջ�Ƿ�Ϊ��)
	 * @param: @return   
	 * @return: E   
	 * @throws
	 */
	public E peek(){
		if(isEmpty())return null;
		else 
			return top.data;
	}
	
}
