package DataStructure;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��4�� ����3:59:23 
 * ��˵�� 
 */
import java.util.*;



public class MyLinkedList {
	
	class Node{
		Node next = null;
		int data;
		public Node (int data){this.data = data;}
	}
	
	
	public Node head = null;
	public static int size = 0;
	public void addNode(int d){
		Node newNode = new Node(d);
		if(head == null){//�ڼ����һ���ڵ��ʱ�򣬸�ͷ����ʼֵ
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
			
		}
		temp.next =newNode;
	}
	
	/**
	 * 
	 * @Title: addNode
	 * @param addNode ,��Ҫ����Ľڵ㣬add_id�� ��Ҫ�����λ��
	 */
	public void addNode(Node addNode, int add_id){
		Node cur = head;
		int id = 0;
		length();
		if(head == null){
			head = addNode ;
			return;
		}
		if(add_id>size){return;}
		while(cur.next!= null){
			if(id == add_id){
				cur.next = addNode;
				addNode.next = cur.next.next;
				size ++;
				return;
			}
			cur = cur.next;
			id++;			
		}
	}
	/*
	 * ��������
	 */
	public int length(){
		Node temp = head;
		while(temp!=null){
			size ++;
			temp = temp.next;		
		}
		return size;
	}
	/**
	 * 
	 * @Title: deleteNode
	 * @Description: TODO(ɾ��ָ��λ�ýڵ㣬��Ҫע����ǣ��ڵ��������У���Ҫ����ǰһ���ڵ㣬�Ա�ɾ��)
	 * @param: @param deleteId
	 * @param: @return   
	 * @return: boolean   
	 * @throws
	 */
	public boolean deleteNode (int deleteId){
		if(deleteId>size||deleteId<0)return false;
		if(deleteId == 1)head = head.next;//����Ҫע����ǣ�ɾ����һ���ڵ㣬��ʾ��ͷ���ɾ���ˣ�
											//������Ҫ��ͷ������һ���ڵ���Ϊͷ���
		int i = 1;
		Node preNode = head;//ͷ���Ϊǰ�ڵ㣬
		Node curNode = preNode.next;
		while(curNode != null){
			if(i == deleteId){
				preNode.next = curNode.next;
				return true;
			}
			i++;
			preNode = curNode;//�������ɾ�������У���Ҫ����ǰ��ڵ�
			curNode = curNode.next;
			
		}
		return true;
	}
/**
 * 
 * @Title: orderList
 * @Description: TODO(ÿ���ҳ���С�ģ�Ȼ��ǰ�������ã��Դ˺��ƣ�ѡ������)
 * @param: @return   
 * @return: Node   
 * @throws
 */
	public Node orderList(){
		Node curNode = head;
		Node nextNode = null;
		while(curNode.next!= null){
			nextNode = curNode.next;
			while(nextNode.next !=null){
				if(curNode.data >nextNode.data){//���͵�ѡ������ѡ�������ǶԺ���Ľ���ѡ����С�ģ����������ǽ��������ǰ���롣
					int temp = curNode.data;					
					curNode.data = nextNode.data;
					nextNode.data = temp;
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;			
		}
		return head;
		
	}
	/**
	 * 
	 * @Title: deleteDuplecate
	 * @Description: TODO(��Hashtable��ɾ���ظ���Ԫ�أ�������Ҫ����Ŀռ����洢�Ѿ���������ֵ��ֻҪ�ǲ��룬ɾ��������Ҫǰ��ڵ��ס)
	 * @param: @param head   
	 * @return: void   
	 * @throws
	 */
	public void deleteDuplecate(Node head){
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		Node curNode = head;
		Node preNode = null;
		while(curNode != null){
			if(table.containsKey(curNode.data)){
				 preNode.next = curNode.next;//
		
			}else {
				table.put(curNode.data, 1);//Hashtable�������ظ��ļ���Hashtable��HashMap�Ĳ����ҪŪ���ס�
				preNode = curNode;//���û���ظ�������Ľڵ��������
			}
			curNode = curNode.next;//��ǰ�����ơ�
		}
		
	}
	/**
	 * 
	 * @Title: deleteDuplecate_doubleLink
	 * @Description: TODO(����˫��ѭ����������ѭ����������������ѭ������������������ͬ����ɾ���������Ⱦ�����)
	 * @param: @param head   
	 * @return: void   
	 * @throws
	 */
	public void deleteDuplecate_doubleLink(Node head){
		Node curNode = head;
		while(curNode != null){
			Node temp = curNode;
			while(temp.next!= null){
				if(temp.next.data == curNode.data){
					temp.next = temp.next.next;//Ҳ������������ɾ����ÿ����ǰ�ڵ���бȽ�
				}
				else{
					temp = temp.next; 
				}
				
			}
			curNode = curNode.next;
		}
	}
	/**
	 * 
	 * @Title: findElem
	 * @Description: TODO(�ҵ�������n���ڵ㣬������ָ��ͬʱ������ֻ��Ҫ����һ������)
	 * @param:    
	 * @return: void   
	 * @throws
	 */
	public Node findElem(int id){
		Node fast = head;
		Node slow  = head;
		int n = 0;
		while(fast.next !=null){
			if(n == id)break;
			fast =fast.next;
			n++;
		}
		while(fast!= null){
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
	public void ReverseIteratively(Node head){
		Node pReversedHead = head;
		Node pNode = head;
		Node pPre = null;
		while(pNode != null){
			Node pNext = pNode.next;
			if(pNext == null)
				pReversedHead = pNode;
			pNode.next = pPre;
			pPre = pNode;
			pNode =pNext;
		}
		this.head = pReversedHead;
	}
	public void printlist(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String []args){
		MyLinkedList list = new MyLinkedList();
		list.addNode(5);
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.printlist();
		list.orderList();
		list.printlist();
		
	}
}
