/**
 * FileName:     AddTwoNumbers_2.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年12月28日 上午10:06:39
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年12月28日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年12月28日 上午10:06:39 
 * 类说明 
 */
/**
 * @ClassName:     AddTwoNumbers_2
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年12月28日 上午10:06:39
 *
 */
public class AddTwoNumbers_2_leetCode_2{
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode rs = new ListNode(0);//先建立一个链表，赋予头结点，头结点一般不用，用头结点的下一个节点。
		ListNode cur = rs;//链表 通常用法是，获取链表的当前结点，然后当前结点往后移动。
		while(l1 != null || l2 != null) {
			int i = 0;
			int j = 0;
			if(l1 != null) {
				i = l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				j = l2.val;
				l2 = l2.next;
			}
			int sum = i + j + carry;
			cur.next = new ListNode(sum % 10);//由于每次相加，需要增加一个节点
			cur = cur.next;//将当前结点指向下一结点
			carry = sum/10;//进位
		}
		if(carry > 0) cur.next = new ListNode(carry);
		return rs.next;//链表的起始有效结点。

	} 

}

