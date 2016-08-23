/**
 * FileName:     AddTwoNumbers.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年10月12日 下午5:02:50
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年10月12日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年10月12日 下午5:02:50 
 * 类说明 
 */


public class AddTwoNumbers_1_leetCode_2 {

	/**
	 * 
	 * @ClassName:     ListNode
	 * @Description:TODO(描述类的作用)
	 * @author:    zts
	 * @date:        2015年10月12日 下午8:05:47
	 *
	 */

	public class ListNode {
		int val; 
		ListNode next; 
		ListNode(int x) { 
			val = x; 
			next = null; 
		} 
	} 

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;  
		if (l2 == null) return l1;  

		//把相加后的结果存放于链表1，pre1是用于最后有进位时在其后new新结点  
		ListNode ret = l1;  
		ListNode pre1 = new ListNode(0);  
		pre1.next = l1;  

		int flag = 0;  
		while (l1 != null && l2 != null) {  
			l1.val = l1.val + l2.val + flag;  
			flag = l1.val / 10;  
			l1.val = l1.val % 10;  
			pre1 = l1;  
			l1 = l1.next;  
			l2 = l2.next;  
		}  

		//如果链表2有剩余，接到链表1的后面  
		if (l2 != null) {  
			pre1.next = l2;  
			l1 = l2;  
		}  

		while (l1 != null) {  
			l1.val += flag;  
			flag = l1.val / 10;  
			l1.val = l1.val % 10;  
			pre1 = l1;  
			l1 = l1.next;  
		}  

		if (flag > 0) {  
			ListNode node = new ListNode(1);  
			pre1.next = node;  
		}  

		return ret;  
	}

}
