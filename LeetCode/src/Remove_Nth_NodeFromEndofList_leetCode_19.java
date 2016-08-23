import java.util.LinkedList;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��11�� ����1:49:55 
 * ��˵�� 
 * ��������ָ��first��second��firstָ�����ƶ�n����
 * ����ʱfirstָ��Ϊ�գ����ʾҪɾ������ͷ�ڵ㣬��ʱֱ�ӷ���head->next���ɡ�
 * ���firstָ�벻Ϊ�գ�������ָ��һ���ƶ���ֱ��firstָ��ָ�����һ���ڵ㣬
 * ��second->next=second->next->next����ɾ������n���ڵ㡣
 */
class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
public class Remove_Nth_NodeFromEndofList_leetCode_19 {



	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p1 = head;  
		ListNode p2 = head;  
		ListNode removeNode = head;  
		int i = 0;  
		while(p1!=null){  
			p1 = p1.next;  
			i++;  
			if(i > n){  
				p2 = removeNode;  
				removeNode = removeNode.next;  
			}  
		}  

		if(removeNode == head){  
			head = head.next;  
		}else{  
			p2.next = removeNode.next;  
		}  
		return head;  
	}    




	public static void main(String agrs []){
		ListNode head = new ListNode(1);  
		ListNode cur = head;  
		for(int i = 0; i < 1; i++)  
		{  

			ListNode tmp = new ListNode(i+2);  
			cur.next = tmp;  
			cur = tmp;  
		}  
		cur = new Remove_Nth_NodeFromEndofList_leetCode_19().removeNthFromEnd(head, 2);  

		for(;cur != null;)  
		{  
			System.out.println(cur.val);  
			cur = cur.next;  
		}  
	}
}
