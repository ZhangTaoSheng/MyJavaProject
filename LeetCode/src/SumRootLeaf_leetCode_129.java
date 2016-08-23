import java.util.TreeSet;

import javax.swing.tree.TreeNode;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��29�� ����6:22:08 
 * ��˵�� ����ҳ����������ڵ㵽Ҷ�ӽڵ������·����
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
	  * @Description: TODO(����������ȱ����㷨)
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
		 //ÿ����ȼ�1������ֵ��λ
		    num = num*10 + node.val;
		 
		    // leaf��Ҷ�ӽڵ�
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
