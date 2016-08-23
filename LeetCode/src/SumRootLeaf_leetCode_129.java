import java.util.TreeSet;

import javax.swing.tree.TreeNode;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月29日 下午6:22:08 
 * 类说明 如何找出二叉树根节点到叶子节点的所有路径。
 * 
 1
| \
2  3
1->2  = 12
1->3  = 13
 */
public class SumRootLeaf_leetCode_129 {
	 class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
	 /**
	  * 
	  * @Title: sumNumbers
	  * @Description: TODO(二叉树的深度遍历算法)
	  * @param: @param root
	  * @param: @return   
	  * @return: int   
	  * @throws
	  */
	 public int sumNumbers(TreeNode root) {
		    if(root == null) 
		        return 0;
		 
		    return dfs(root, 0, 0);
		}
		 
		public int dfs(TreeNode node, int num, int sum){
		    if(node == null) return sum;
		 //每次深度加1，则将数值升位
		    num = num*10 + node.val;
		 
		    // leaf，叶子节点
		    if(node.left == null && node.right == null) {
		        sum += num;
		        return sum;
		    }
		 
		    // left subtree + right subtree
		    sum = dfs(node.left, num, sum) + dfs(node.right, num, sum);
		    return sum;
		}
	 
	 
	 public static void main(String args[]){
		
		 
	 }
	 
}
