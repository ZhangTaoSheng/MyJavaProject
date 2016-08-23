/**
 * FileName:     DNode.java
 * @Description: TODO(选择排序)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年6月28日 下午12:23:45
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年6月28日       zts         1.0             1.0
 * 
 */
 
package com.java.link;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年6月28日 下午12:23:45 
 * 类说明 
 */
/**
 * @ClassName:     DNode
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年6月28日 下午12:23:45
 *
 */

public class DNode<T> { // 泛型类的定义
	public T nodeValue;
	public DNode<T> prev;
	public DNode<T> next;
	public DNode(){
		nodeValue = null;
		next = this;
		prev = this;
	}
	public DNode(T item){
		nodeValue = item;
		next = this;
		prev = this;
	}
	
	public static <T> DNode<T> addBefore(DNode<T> curr, T item){
		DNode <T> newNode ,prevNode;
		newNode = new DNode<T>(item);
		prevNode = curr.prev;
	
		newNode.next = curr;
		newNode.prev = prevNode;
		curr.prev = newNode;
		prevNode.next = newNode;
		return newNode;
	}
	
	public static <T> void remove(DNode<T> curr){  //泛型方法在用到泛型类型时，在返回值类型前面定义泛型表示。
		if(curr.next == curr){
			return;//如果链表为空，则直接返回就可以
		}
		DNode<T> prevNode = curr.prev;
		DNode<T> nexNode = curr.next ;
		prevNode.next = nexNode;
		nexNode.prev  = prevNode;
		
	}
	
	/*
	 * DNode.addBefore(header.next ,item).....从列表头插入数据项
	 * DNode.remove(header.next) .....从列表头删除节点
	 * DNode.remove(header.prev) .....从列表尾部删除节点
	 * DNode.addBefore(header ,item).... 从列表尾部插入数据
	 * header.prve.nodeValue   .....最后一个节点的值
	 * header.next.nodeValue  ..... 第一个节点的值
	 *
	 */
	
}
