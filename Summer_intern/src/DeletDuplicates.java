/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��17�� ����6:27:26 
 * ��˵�� 
 */
public class DeletDuplicates {
	class Node{
		int val;
		Node next;
		public Node(int val){
			this.val = val;
			this.next = null;
					
		}
	}
	public void deletDup(Node node){
		Node cur = node;
		while(cur.next!=null){
			if(cur.val == cur.next.val){
				cur.next =cur.next.next;
			}else{
				cur = cur.next;
			}
			
		}
	}

}