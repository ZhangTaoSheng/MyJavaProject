/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��17�� ����5:08:44 
 * ��˵�� 
 * �ϲ��������������
 */
public class MergeTwoSortedList {
	class Node {
		int val;
		Node next;
		public Node(int val){
			this.val = val;
		}
	}
	
	
	public Node mergeTwoLists(Node l1,Node l2){
		Node p1 = l1;
		Node p2 = l2;//����ֱ�����β���ʹ��
		Node head = new Node(0);
		Node p = head;
		while(p1!=null&&p2!=null){
			if(p1.val <=p2.val){
				p.next = p1;
				p1 = p1.next;
			}else{
				p.next =p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		if(p1!= null){
			p.next = p1;
		}
		if(p2!=null){
			p.next = p2;
		}
		return head.next;
	}
	//���õݹ���ʵ��������������ĺϲ�
	public Node merge(Node l1,Node l2){
		if(l1 == null)return l2;
		if(l2 == null)return l1;
		Node pnew = null;
		Node p1 = l1;
		Node p2 = l2;
		
		if(p1.val <p2.val){
			pnew = p1;
			pnew.next = merge(p1.next,p2);
		}
		else{
			pnew = p2;
			pnew.next = merge(p1,p2.next);
		}
		return pnew;
	}

}
