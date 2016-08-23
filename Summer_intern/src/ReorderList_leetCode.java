/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月17日 下午3:18:31 
 * 类说明 
 * Given a singly linked list L:L0-L1-L2-L3-L4.......-Ln-1-Ln
 * reorder it to L0-Ln-L1-Ln-1-L2-Ln-2........
 * 方法：首先找到链表的中心节点 ，分成两个链表。然后翻转后面的链表，最后合并两个链表。
 * 这里涉及到三个考点：1，找中心节点
 * 2，翻转链表
 * 3，合并链表
 */
public class ReorderList_leetCode {
	class Node{
		int val;
		Node next;
		public Node(int val){this.val = val;}
	}
	public void reorderList(Node head){
		//Node second = findMidNode(head);
		Node fast = head;
		Node slow = head;
		while(fast!=null&&fast.next !=null&&fast.next.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		Node second = slow.next;
		slow.next = null;
		Node reverse_second = reverseList(second);
		merge(head,second);
		
	}
	/**
	 * 
	 * @Title: findMidNode
	 * @Description: TODO(用快慢指针找到中心节点，返回中心节点的后一个节点)
	 * @param: @param head
	 * @param: @return   
	 * @return: Node   
	 * @throws
	 */
	public Node findMidNode(Node head){
		Node fast = head;
		Node slow = head;
		while(fast!=null&&fast.next !=null&&fast.next.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.next;
		
	}
	/**
	 * 
	 * @Title: reverseList
	 * @Description: TODO(翻转链表)
	 * @param: @param head
	 * @param: @return   
	 * @return: Node   
	 * @throws
	 */
	public Node reverseList(Node head){
		Node pre = null;
		Node headNew = null;
		Node cur = head;
		while(cur!=null){
			Node tmp = cur.next;
			if(cur.next == null)headNew = cur;
			cur.next = pre;
			pre =cur;
			//cur = cur.next;	千万不能这么写，因为cur.next已经被重新赋值了，所以需要事先保存
			cur =tmp;
		}
		return headNew;	
		
	}
	
	/**
	 * 
	 * @Title: merge
	 * @Description: TODO(交叉合并两个链表)
	 * @param: @param p1
	 * @param: @param p2   
	 * @return: void   
	 * @throws
	 */
	public void merge(Node p1,Node p2){
		Node first = p1;
		Node second = p2;
		while(p2!=null){
			Node temp1 = p1.next;
			Node temp2 = p2.next;
			p1.next = p2;
			p2.next = temp1;
			p1 = temp1;
			p2 = temp2;
			
		}
	}
	

	
}
