/**
 * FileName:     Node.java
 * @Description: TODO(ѡ������)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��6��25�� ����9:03:09
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��6��25��       zts         1.0             1.0
 * 
 */
 
package com.java.link;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��6��25�� ����9:03:09 
 * ��˵�� 
 */
/**
 * @ClassName:     Node
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��6��25�� ����9:03:09
 *
 */

public class Node<T> {
	public T nodeValue;
	public Node<T> next;
	public Node(){
		nodeValue = null;
		next = null;
	}
	public Node(T item){
		nodeValue = item;
		next = null;
		
	}
	
	public static <T> String toString(Node<T> front){
		if(front == null)
			return "null";
		Node<T> curr = front;
		String str = "["+curr.nodeValue;
		while(curr.next !=  null){
			curr = curr.next;
			str += ","+curr.nodeValue;
		}
		str += "]";
		return str;
	}
	
	public static <T> Node<T> remove(Node<T> front ,T target){
		Node<T> curr  = front, prev = null;
		boolean foundItem = false;
		while(curr != null && !foundItem){
			if(target.equals(curr.nodeValue)){
				if(prev == null)
					front = front.next;
				else 
					prev.next = curr.next;
				foundItem = true;
			}
			else 
			{
				prev  = curr;
				curr = curr.next;
				
			}
		}
		
		return front;
	}

}
