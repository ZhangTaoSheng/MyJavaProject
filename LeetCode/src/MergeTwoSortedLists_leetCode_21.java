/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月6日 下午7:51:49 
 * 类说明 
 */
public class MergeTwoSortedLists_leetCode_21 {
	private class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode result = new ListNode(0);
		ListNode head = result;
		if (l1 == null ) return l2;
		if(l2 == null) return l1;
		while(l1 !=  null&&l2 != null){
			if(l1.val>l2.val){
				result.next = l2;
				l2 = l2.next;				
			}
			else{
				result.next = l1;
				l1 = l1.next;
			}
			result = result.next;
					
		}
		while(l2!= null){	
			result.next = l2;
			l2 = l2.next;
			result = result.next;
						
		}
		while(l1!= null){	
			result.next = l1;
			l1 = l1.next;
			result = result.next;
						
		}
		return head.next;
	}
	public static void main(String [] args){
		MergeTwoSortedLists_leetCode_21 ll = new MergeTwoSortedLists_leetCode_21();
		ListNode l1 = ll.new  ListNode(1);
		ListNode l2 = ll.new  ListNode(5);
		ll.mergeTwoLists(l1, l2);
	}
}
