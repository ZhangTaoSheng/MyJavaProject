package DataStructure;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月5日 上午8:17:52 
 * 类说明 
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
	 * @Description: TODO(队尾指针和头指针相同的时候，就是空队列)
	 * @param: @return   
	 * @return: boolean   
	 * @throws
	 */
	public boolean isEmpty(){
		return head == tail;
	}
	
	/**
	 * @Description :只能在队尾添加，添加的第一个节点应该用来初始化首尾指针
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
	 * @Description: TODO(这里需要清楚的是，当出队列的时候，头节点的下一个节点是添加的第一个节点，方向与尾节点是反的)
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
			size++;//这两句不能写反了，因为是先计数，后移动指针
			temp = temp.next;
			
		}
		return size;
	}
}
