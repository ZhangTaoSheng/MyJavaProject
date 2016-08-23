import java.util.LinkedList;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月11日 下午1:49:55 
 * 类说明 
 * 设置两个指针first跟second。first指针先移动n步，
 * 若此时first指针为空，则表示要删除的是头节点，此时直接返回head->next即可。
 * 如果first指针不为空，则将两个指针一起移动，直到first指针指向最后一个节点，
 * 令second->next=second->next->next即可删除第你n个节点。
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
