/**
 * FileName:     AddTwoNumbers_2.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��12��28�� ����10:06:39
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��12��28��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��12��28�� ����10:06:39 
 * ��˵�� 
 */
/**
 * @ClassName:     AddTwoNumbers_2
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��12��28�� ����10:06:39
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
		ListNode rs = new ListNode(0);//�Ƚ���һ����������ͷ��㣬ͷ���һ�㲻�ã���ͷ������һ���ڵ㡣
		ListNode cur = rs;//���� ͨ���÷��ǣ���ȡ����ĵ�ǰ��㣬Ȼ��ǰ��������ƶ���
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
			cur.next = new ListNode(sum % 10);//����ÿ����ӣ���Ҫ����һ���ڵ�
			cur = cur.next;//����ǰ���ָ����һ���
			carry = sum/10;//��λ
		}
		if(carry > 0) cur.next = new ListNode(carry);
		return rs.next;//�������ʼ��Ч��㡣

	} 

}

