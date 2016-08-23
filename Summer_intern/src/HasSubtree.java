/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��18�� ����6:56:41 
 * ��˵�� 
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
				ret = DoesSub(big,small);//����ҵ����ڵ�����ͬ�ĵ㣬������ж��Ƿ����ṹ��ͬ
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
		if(t2 == null)return true;//�ݹ�ĳ���������
		if(t1 == null)return false;//���������С���߶�С���򷵻�false
		if(t1.val != t2.val)return false;//�������ȣ��򲻵�
		return DoesSub(t1.left,t2.left)&&DoesSub(t1.right,t2.right);
		
	}
}
