import java.util.Vector;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��4��13�� ����10:00:10 
 * ��˵�� 
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
	  * @Description:(�������ʵ��������ȱ�����������
	  * ��root����0�㣩Ϊ�������ȡ��0��Ľڵ㣬���1��Ľڵ㲻��ȡ��
	  * �����ȡ��0��Ľڵ㣬���1��Ľڵ��ȡ�ɲ�ȡ��
	  * ����������Ҫ��¼��ÿ���ڵ�ȡ�벻ȡʱ�ܹ���ȡ�����Ǯ����
	  * ͨ��������ȱ��������������ȡroot�ڵ㷵�ص�������ֵ�д�ľͿ�����)
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
