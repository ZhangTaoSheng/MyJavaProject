/**
 * FileName:     Node.java
 * @Description: TODO(选择排序)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年6月25日 上午9:03:09
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年6月25日       zts         1.0             1.0
 * 
 */
 
package com.java.link;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年6月25日 上午9:03:09 
 * 类说明 
 */
/**
 * @ClassName:     Node
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年6月25日 上午9:03:09
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
