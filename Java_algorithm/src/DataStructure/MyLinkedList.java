package DataStructure;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月4日 下午3:59:23 
 * 类说明 
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
		if(head == null){//在加入第一个节点的时候，给头结点初始值
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
	 * @param addNode ,需要加入的节点，add_id， 需要插入的位置
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
	 * 求链表长度
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
	 * @Description: TODO(删除指定位置节点，需要注意的是，在单向链表中，需要保存前一个节点，以便删除)
	 * @param: @param deleteId
	 * @param: @return   
	 * @return: boolean   
	 * @throws
	 */
	public boolean deleteNode (int deleteId){
		if(deleteId>size||deleteId<0)return false;
		if(deleteId == 1)head = head.next;//这里要注意的是，删除第一个节点，表示，头结点删除了，
											//所以需要将头结点的下一个节点设为头结点
		int i = 1;
		Node preNode = head;//头结点为前节点，
		Node curNode = preNode.next;
		while(curNode != null){
			if(i == deleteId){
				preNode.next = curNode.next;
				return true;
			}
			i++;
			preNode = curNode;//在链表的删除过程中，需要保存前向节点
			curNode = curNode.next;
			
		}
		return true;
	}
/**
 * 
 * @Title: orderList
 * @Description: TODO(每次找出最小的，然后前面的排序好，以此后推，选择排序)
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
				if(curNode.data >nextNode.data){//典型的选择排序，选择排序是对后面的进行选择最小的，插入排序是将后面的往前插入。
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
	 * @Description: TODO(用Hashtable来删除重复的元素，但是需要额外的空间来存储已经遍历过的值，只要是插入，删除，都需要前向节点跟住)
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
				table.put(curNode.data, 1);//Hashtable不能有重复的键，Hashtable与HashMap的差别需要弄明白。
				preNode = curNode;//如果没有重复，后面的节点跟上来。
			}
			curNode = curNode.next;//当前结点后移。
		}
		
	}
	/**
	 * 
	 * @Title: deleteDuplecate_doubleLink
	 * @Description: TODO(利用双重循环遍历，外循环正常遍历链表，内循环，向里遍历。如果相同，则删除。挨个比就是了)
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
					temp.next = temp.next.next;//也可以这样进行删除，每次在前节点进行比较
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
	 * @Description: TODO(找到倒数第n个节点，用两个指针同时遍历，只需要遍历一次链表)
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
