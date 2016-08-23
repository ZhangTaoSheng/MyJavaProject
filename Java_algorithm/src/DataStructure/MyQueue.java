package DataStructure;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��5�� ����8:17:52 
 * ��˵�� 
 */
class Node<E>{
	Node<E> next = null;
	E data = null;
	public Node(E data){
		this.data = data;
	}
}
public class MyQueue<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	
	/**
	 * 
	 * @Title: isEmpty
	 * @Description: TODO(��βָ���ͷָ����ͬ��ʱ�򣬾��ǿն���)
	 * @param: @return   
	 * @return: boolean   
	 * @throws
	 */
	public boolean isEmpty(){
		return head == tail;
	}
	
	/**
	 * @Description :ֻ���ڶ�β��ӣ���ӵĵ�һ���ڵ�Ӧ��������ʼ����βָ��
	 * @return : void
	 * @param : E data
	 * */

	public void put(E data){
		Node<E> newNode = new Node<E>(data);
		if(head == null && tail == null){
			head = tail = newNode;
		}else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	/**
	 * 
	 * @Title: pop
	 * @Description: TODO(������Ҫ������ǣ��������е�ʱ��ͷ�ڵ����һ���ڵ�����ӵĵ�һ���ڵ㣬������β�ڵ��Ƿ���)
	 * @param: @return   
	 * @return: E   
	 * @throws
	 */
	public E pop (){
		if(isEmpty())return null;
		else{
			E data = head.data;
			head = head.next;
			return data;
		}
	}
	
	public int size (){
		Node<E> temp = head;
		int size = 0;
		while(temp!= null){
			size++;//�����䲻��д���ˣ���Ϊ���ȼ��������ƶ�ָ��
			temp = temp.next;
			
		}
		return size;
	}
}
