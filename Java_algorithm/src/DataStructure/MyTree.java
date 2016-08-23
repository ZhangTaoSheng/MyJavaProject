package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月6日 下午1:56:49 
 * 类说明 
 * 1.一颗非空二叉树的第i层上最多有2^(i-1)个节点
 * 2.一颗深度为k 的二叉树中，最多有2^-1个节点，最少有k个节点
 * 3.所有节点的度数之和+1=节点总数
 * 4.叶子节点总是比度为2的节点数多一个
 * 5.具有n个节点的完全二叉树的深度为[log n]+1
 * 6.对于具有n个节点的完全二叉树，编号之后，i>1的双亲节点的编号是i/2
 */

public class MyTree {

	//注意二叉树的节点的类型，两个左右节点
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
	 * @Description:TODO(在插入过程中，需要找到合适的位置，从根节点往下搜索，每次搜索时，记录父节点)
	 */
	public void insert(int data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
		}else{
			Node cur = root;
			Node parent = cur;//需要保存父节点。
			while(true){//中序排列树，直到搜索到位置为止，否则不停止
				parent = cur;
				if(data<cur.data){
					cur = cur.left;//一直从左子树找下去。
					if(cur ==null){//不为空的话，就再次搜索
						parent.left = newNode;
						return;
					}
				}else{
					cur = cur.right;//搜索当前节点的右节点
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
	 * @Description: TODO(中序遍历)
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
	 * @Description: TODO(先序遍历)
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
	 * @Description: TODO(后序遍历)
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
	 * @Description: TODO(层序遍历,先将根节点放入队列中，然后打印出队列的节点，再将节点的子节点加入到队列，直到队列为空为止)
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
			if(pollNode.left!= null){//每次出队的元素必须将子节点入队
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
	 * @Description: TODO(在先序遍历数组中找到根节点，然后在中序遍历数组找到根节点所在的位置，左侧的为左子树序列，右侧的为右子树序列，计算左右子树的个数，然
	 * 后 在先序遍历数组中找到左右子树，依次递归，知道找不到左右子树为止)
	 * @param: @param preOrder start1 end1 inOrder start2 end2  
	 * @return: Node   
	 * @throws
	 */
	public Node tranTree(int []preOrder,int start1,int end1,int []inOrder,int start2,int end2){
		Node root = null;
		if(start1>end1||start2>end2)return null;//找不到左右子树则跳出
		int rootStart = preOrder[0];//先找到根节点
		root = new Node(rootStart);
		int rootIndex = findIndex(rootStart,inOrder,start2,end2);//在中序遍历的序列中找到根节点的位置
		int offSet = rootIndex - start2 -1 ;//通过中序遍历的数组，找到左右子树在先序序列的位置区间。
		Node left = tranTree(preOrder, start1+1,start1+1+offSet,inOrder,start2,start2+offSet);//递归构建左子树
		Node right = tranTree(preOrder, start1+1+offSet+1,end1,inOrder,rootIndex+1,end2);//递归构建右子树
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
