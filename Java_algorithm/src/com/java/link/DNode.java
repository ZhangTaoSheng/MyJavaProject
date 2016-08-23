/**
 * FileName:     DNode.java
 * @Description: TODO(ѡ������)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��6��28�� ����12:23:45
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��6��28��       zts         1.0             1.0
 * 
 */
 
package com.java.link;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��6��28�� ����12:23:45 
 * ��˵�� 
 */
/**
 * @ClassName:     DNode
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��6��28�� ����12:23:45
 *
 */

public class DNode<T> { // ������Ķ���
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
	
	public static <T> void remove(DNode<T> curr){  //���ͷ������õ���������ʱ���ڷ���ֵ����ǰ�涨�巺�ͱ�ʾ��
		if(curr.next == curr){
			return;//�������Ϊ�գ���ֱ�ӷ��ؾͿ���
		}
		DNode<T> prevNode = curr.prev;
		DNode<T> nexNode = curr.next ;
		prevNode.next = nexNode;
		nexNode.prev  = prevNode;
		
	}
	
	/*
	 * DNode.addBefore(header.next ,item).....���б�ͷ����������
	 * DNode.remove(header.next) .....���б�ͷɾ���ڵ�
	 * DNode.remove(header.prev) .....���б�β��ɾ���ڵ�
	 * DNode.addBefore(header ,item).... ���б�β����������
	 * header.prve.nodeValue   .....���һ���ڵ��ֵ
	 * header.next.nodeValue  ..... ��һ���ڵ��ֵ
	 *
	 */
	
}
