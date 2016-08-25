/**
 * @author zts
 * @version 2016/8/25
 * @description ���������ҳ��ۼ�ֵΪָ����ֵ�ļ��ϣ�Ԫ�ز����ظ���
 * dfs�㷨���뱣֤��ǰ�ڵ�������Ϻ�pop����ǰ�ڵ㡣������һ��ƽ���Ľڵ㡣
 */
import java.util.*;
public class Combination_sum_leetCode_39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		Arrays.sort(candidates);
		findSum(candidates,target,0,0,temp,ret);
		return ret;
	}
	public void findSum(int [] candidates, int target,int sum,int start ,List<Integer>temp,List<List<Integer>>ret){
		if(sum == target){
			ret.add(new ArrayList<>(temp));
			return;
		} else if (sum>target){//��target����ǰ�����ֲ���Ҫ��ƥ���ˡ�
			return;
		}else { //��targetС������Ҫ�����ӵ�ǰlevel�ĸ���
			for(int i = start;i<candidates.length;i++){
				temp.add(candidates[i]);
				findSum(candidates,target,sum+candidates[i],i,temp,ret);//���޸��������أ����ԣ��´λ��Ǵӵ�ǰ��Ԫ�ؿ�ʼ����
				temp.remove(temp.size()-1);//�����������ǰƥ������Ժ���Ҫ���ص��ϲ㡣
			}
		}

	}
public static void main (String args[]){
	Combination_sum_leetCode_39 ls = new Combination_sum_leetCode_39();
	 Scanner in = new Scanner(System.in);
	 System.out.println("���������鳤�ȣ�");
	 int len = in.nextInt();
	 int [] candidates = new int [len];
	 System.out.println("����������Ԫ�أ�");
	 for(int i=0;i<len ;i++)
	 {
		 candidates[i] = in.nextInt();
	 }
	 System.out.println("����ʼ��");
	 int target = 10;
	 List<List<Integer>> ret = ls.combinationSum(candidates, target);
	 for(int i = 0;i<ret.size();i++)
	 {
		 System.out.print("�� "+i+" ����ϣ�");
		 List<Integer> temp = ret.get(i);
		 for(int j =0; j<temp.size();j++){
			 System.out.print(temp.get(j)+" ");			 
		 }
		System.out.println();		 
	 }
}
}