/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��17�� ����3:18:31 
 * ��˵�� 
 * Given a singly linked list L:L0-L1-L2-L3-L4.......-Ln-1-Ln
 * reorder it to L0-Ln-L1-Ln-1-L2-Ln-2........
 * �����������ҵ���������Ľڵ� ���ֳ���������Ȼ��ת������������ϲ���������
 * �����漰���������㣺1�������Ľڵ�
 * 2����ת����
 * 3���ϲ�����
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
	 * @Description: TODO(�ÿ���ָ���ҵ����Ľڵ㣬�������Ľڵ�ĺ�һ���ڵ�)
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
	 * @Description: TODO(��ת����)
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
			//cur = cur.next;	ǧ������ôд����Ϊcur.next�Ѿ������¸�ֵ�ˣ�������Ҫ���ȱ���
			cur =tmp;
		}
		return headNew;	
		
	}
	
	/**
	 * 
	 * @Title: merge
	 * @Description: TODO(����ϲ���������)
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
