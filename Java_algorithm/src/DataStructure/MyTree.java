package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��6�� ����1:56:49 
 * ��˵�� 
 * 1.һ�ŷǿն������ĵ�i���������2^(i-1)���ڵ�
 * 2.һ�����Ϊk �Ķ������У������2^-1���ڵ㣬������k���ڵ�
 * 3.���нڵ�Ķ���֮��+1=�ڵ�����
 * 4.Ҷ�ӽڵ����Ǳȶ�Ϊ2�Ľڵ�����һ��
 * 5.����n���ڵ����ȫ�����������Ϊ[log n]+1
 * 6.���ھ���n���ڵ����ȫ�����������֮��i>1��˫�׽ڵ�ı����i/2
 */

public class MyTree {

	//ע��������Ľڵ�����ͣ��������ҽڵ�
	class Node{
		public int data;
		public Node left;
		public Node right;
		public Node(int data){
			this.data = data;
		}
	}
	public Node root;
	public MyTree(){
		root = null;
	}
	/**
	 * @Description:TODO(�ڲ�������У���Ҫ�ҵ����ʵ�λ�ã��Ӹ��ڵ�����������ÿ������ʱ����¼���ڵ�)
	 */
	public void insert(int data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
		}else{
			Node cur = root;
			Node parent = cur;//��Ҫ���游�ڵ㡣
			while(true){//������������ֱ��������λ��Ϊֹ������ֹͣ
				parent = cur;
				if(data<cur.data){
					cur = cur.left;//һֱ������������ȥ��
					if(cur ==null){//��Ϊ�յĻ������ٴ�����
						parent.left = newNode;
						return;
					}
				}else{
					cur = cur.right;//������ǰ�ڵ���ҽڵ�
					if(cur == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void buildTree(int [] data){
		for(int i = 0; i<data.length;i++){
			insert(data[i]);
		}
	}
	/**
	 * 
	 * @Title: inOrder
	 * @Description: TODO(�������)
	 * @param: @param localRoot   
	 * @return: void   
	 * @throws
	 */
	public void inOrder(Node localRoot){
		if(localRoot != null){
			inOrder(localRoot.left);
			System.out.println(localRoot.data);
			inOrder(localRoot.right);
		}
	}
	/**
	 * 
	 * @Title: preOrder
	 * @Description: TODO(�������)
	 * @param: @param localRoot   
	 * @return: void   
	 * @throws
	 */
	public void preOrder(Node localRoot){
		if(localRoot != null){
			System.out.println(localRoot.data);
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}
	}
	/**
	 * 
	 * @Title: postOrder
	 * @Description: TODO(�������)
	 * @param: @param localRoot   
	 * @return: void   
	 * @throws
	 */
	public void postOrder(Node localRoot){
		if(localRoot != null){
			postOrder(localRoot.left);
			postOrder(localRoot.right);
			System.out.println(localRoot.data);
		}
	}
	/**
	 * 
	 * @Title: levelOrder
	 * @Description: TODO(�������,�Ƚ����ڵ��������У�Ȼ���ӡ�����еĽڵ㣬�ٽ��ڵ���ӽڵ���뵽���У�ֱ������Ϊ��Ϊֹ)
	 * @param: @param localRoot   
	 * @return: void   
	 * @throws
	 */
	public void levelOrder(Node localRoot){
		if(localRoot  == null)return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(localRoot);
		while(!q.isEmpty()){
			Node pollNode =q.poll();
			
			System.out.println(pollNode);
			if(pollNode.left!= null){//ÿ�γ��ӵ�Ԫ�ر��뽫�ӽڵ����
				q.add(pollNode.left);
			}
			if(pollNode.right != null){
				q.add(pollNode.right);
			}
		}

	}

	public Node tranTree(int []preOrder, int []inOrder){
		Node root = tranTree(preOrder,0,preOrder.length-1,inOrder,0,inOrder.length);
		return root;
	}
	/**
	 * 
	 * @Title: tranTree
	 * @Description: TODO(����������������ҵ����ڵ㣬Ȼ����������������ҵ����ڵ����ڵ�λ�ã�����Ϊ���������У��Ҳ��Ϊ���������У��������������ĸ�����Ȼ
	 * �� ����������������ҵ��������������εݹ飬֪���Ҳ�����������Ϊֹ)
	 * @param: @param preOrder start1 end1 inOrder start2 end2  
	 * @return: Node   
	 * @throws
	 */
	public Node tranTree(int []preOrder,int start1,int end1,int []inOrder,int start2,int end2){
		Node root = null;
		if(start1>end1||start2>end2)return null;//�Ҳ�����������������
		int rootStart = preOrder[0];//���ҵ����ڵ�
		root = new Node(rootStart);
		int rootIndex = findIndex(rootStart,inOrder,start2,end2);//������������������ҵ����ڵ��λ��
		int offSet = rootIndex - start2 -1 ;//ͨ��������������飬�ҵ������������������е�λ�����䡣
		Node left = tranTree(preOrder, start1+1,start1+1+offSet,inOrder,start2,start2+offSet);//�ݹ鹹��������
		Node right = tranTree(preOrder, start1+1+offSet+1,end1,inOrder,rootIndex+1,end2);//�ݹ鹹��������
		root.left = left;
		root.right = right;		
		return root;
	}

	public int findIndex(int target, int []arr,int start,int end){
	
		for(int i = start;i<=end;i++){
			if(target == arr[i])return i;
		}
		
		return -1;
	}

}
