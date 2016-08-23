/**
 * FileName:     AddTwoNumbers.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��10��12�� ����5:02:50
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��10��12��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��10��12�� ����5:02:50 
 * ��˵�� 
 */


public class AddTwoNumbers_1_leetCode_2 {

	/**
	 * 
	 * @ClassName:     ListNode
	 * @Description:TODO(�����������)
	 * @author:    zts
	 * @date:        2015��10��12�� ����8:05:47
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

		//����Ӻ�Ľ�����������1��pre1����������н�λʱ�����new�½��  
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

		//�������2��ʣ�࣬�ӵ�����1�ĺ���  
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
