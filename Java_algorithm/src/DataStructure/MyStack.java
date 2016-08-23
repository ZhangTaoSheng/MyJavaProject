package DataStructure;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月4日 下午10:11:36 
 * 类说明 
 */
/*
 * 
 * @ClassName:     Node
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2016年3月5日 上午8:05:58
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
	 * @Description: TODO(栈的所有操作只能是对栈顶节点进行操作，所以，当栈顶指针为空的时候，说明栈为空)
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
	 * @Description: TODO(压入栈，记住上浮栈顶指针)
	 * @param: @param data   
	 * @return: void   
	 * @throws
	 */
	public void push(E data){
		Node<E> addNode = new Node<E>(data);
		addNode.next = top;
		top = addNode;//栈顶指针上浮，每次入栈一个节点，将栈顶指针指向当前入栈节点。
	}
	/**
	 * 
	 * @Title: pop
	 * @Description: TODO(弹出栈，记住下沉栈顶指针)
	 * @param: @return   
	 * @return: E   
	 * @throws
	 */
	public E pop(){
		if(isEmpty())return null;//记住，null本身不是对象，不属于java.lang.Object，也不是实例。与“”不同，“”表示申明了字符串长度为0的字符串。
		E data = top.data;
		top = top.next;//栈顶指针下沉。
		return data;
	}
	/**
	 * 
	 * @Title: peek
	 * @Description: TODO(返回栈顶节点数据，记住一定要判断栈是否为空)
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
