import java.util.Vector;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年4月13日 下午10:00:10 
 * 类说明 
 */
public class HouseRobberII_leetCode_337 {
	 class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 public int rob(TreeNode root){
		 Vector<Integer>ret = getMoney(root);	 
		 return Math.max(ret.get(0),ret.get(1));
	 }
	 /**
	  * 
	  * @Title: getMoney
	  * @Description:(这道题其实是深度优先遍历二叉树。
	  * 拿root（第0层）为例，如果取第0层的节点，则第1层的节点不能取；
	  * 如果不取第0层的节点，则第1层的节点可取可不取。
	  * 这样我们需要记录下每个节点取与不取时能够获取的最大钱数，
	  * 通过深度优先遍历二叉树，最后取root节点返回的两个数值中大的就可以了)
	  * @param: @param rootNode 
	  * @throws
	  */
	public Vector<Integer> getMoney(TreeNode rootNode){
		 Vector<Integer> ret = new Vector<Integer>(2, 0); 
	        if(rootNode == null) return ret;  
	        Vector<Integer> lRet = getMoney(rootNode.left);  
	        Vector<Integer> rRet = getMoney(rootNode.right);  
	        ret.add(0, lRet.get(1) + rRet.get(1) + rootNode.val);  
	        ret.add(1, Math.max(lRet.get(0), lRet.get(1)) + Math.max(rRet.get(0), rRet.get(1))) ;
	        return ret;  
		
	}
	
	public static void main(String[] args) {

	}

}
