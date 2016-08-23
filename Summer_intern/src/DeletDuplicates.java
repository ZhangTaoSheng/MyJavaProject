/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月17日 下午6:27:26 
 * 类说明 
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
