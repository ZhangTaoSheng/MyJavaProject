/**
 * FileName:     LinkedList.java
 * @Description: TODO(选择排序)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年6月28日 下午5:54:57
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
 * @version 创建时间：2015年6月28日 下午5:54:57 
 * 类说明 
 */
/**
 * @ClassName:     LinkedList
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年6月28日 下午5:54:57
 *
 */

public class LinkedList_sel<T> {
	
	private int listSize;
    private DNode<T> header;
    private int modCount;
    private DNode<T> nodeAtIndex(int index){
    	rangeCheck(index);
    	DNode<T>  p = header;
    	for(int j = 0;j<= index;j++){
    		p = p.next; // 需要注意的是头结点是header ,真正有数据的是第二个结点
    		
    	}
    	return p;
    }
    
    private void rangeCheck(int index){
    	if(index<0||index>=listSize+1){
    		throw new IndexOutOfBoundsException(
    			"\n"+": index"+index +"out of bounds.Should be in the range 0 to "+listSize
    		  )  ;
    		
    	}
    }
    
    public LinkedList_sel(){
    	header = new DNode<T>();
    	listSize = 0;
    	modCount = 0;
    }
    
    public T set(int index , T item){
    	DNode<T> p = nodeAtIndex(index);
    	T previousValue = p.nodeValue;
    	p.nodeValue = item;
    	return previousValue;
    	
    }
    
    public int indexOf (Object item){
    	int index = 0;
    	for(DNode<T> curr = header.next ; curr!=header;curr = curr.next){
    		if(item.equals(curr.nodeValue))return index;
    		index++;
    	}
    	return -1;
    }
    
    public boolean contains(Object item){
    	return indexOf(item)>=0;
    }
    
    public boolean add(T item){
    	DNode.addBefore(header, item);
    	listSize++;
    	return true;
    }
    
    public T remove (int index){
    	DNode<T>  p = nodeAtIndex(index);
    	T returnElement = p.nodeValue;
    	DNode.remove(p);
    	listSize--;
    	modCount++;
    	return returnElement;
    }
    
}
