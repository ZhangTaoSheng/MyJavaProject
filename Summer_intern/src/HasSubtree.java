/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月18日 下午6:56:41 
 * 类说明 
 */
public class HasSubtree {
	class TreeNode{
		int val ;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val = val;
		}
	}
	public boolean isSubTree(TreeNode big,TreeNode small){
		boolean ret = false;
		if(big!= null&& small!= null){
			if(big.val == small.val){
				ret = DoesSub(big,small);//如果找到根节点是相同的点，则继续判断是否树结构相同
			}
			if(!ret){
				ret = isSubTree(big.left,small);
			}
			if(!ret){
				ret = isSubTree(big.right,small);
			}
		}
		return ret;
	}
	public boolean DoesSub(TreeNode t1, TreeNode t2){
		if(t2 == null)return true;//递归的出口条件。
		if(t1 == null)return false;//如果大树比小树高度小，则返回false
		if(t1.val != t2.val)return false;//如果不相等，则不等
		return DoesSub(t1.left,t2.left)&&DoesSub(t1.right,t2.right);
		
	}
}
