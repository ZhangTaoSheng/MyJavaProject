/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��19�� ����10:55:55 
 * ��˵�� 
 * ��һ������������
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
		//�������ҽڵ�
			TreeNode temp =root.left;
			root.left = root.right;
			root.right = temp;
			//�ݹ���ȥ������Ѱ��
		if(root.left!=null)mirrorTree(root.left);
		if(root.right!= null)mirrorTree(root.right);
	}

}
