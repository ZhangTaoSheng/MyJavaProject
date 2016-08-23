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
			temp.remove(temp.size()-1);//���û�з��أ�˵�����һ������
		}
	}
	
}
}