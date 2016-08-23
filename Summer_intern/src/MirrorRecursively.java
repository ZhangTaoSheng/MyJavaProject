/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月19日 上午10:55:55 
 * 类说明 
 * 将一个二叉树镜像
 */
public class MirrorRecursively {
	class TreeNode {
		int val ;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val = val;
	}
	}
	public void mirrorTree(TreeNode root){
		if(root  == null)return;
		if(root.left ==null &&root.right ==null)return;	
		//交换左右节点
			TreeNode temp =root.left;
			root.left = root.right;
			root.right = temp;
			//递归下去，继续寻找
		if(root.left!=null)mirrorTree(root.left);
		if(root.right!= null)mirrorTree(root.right);
	}

}
