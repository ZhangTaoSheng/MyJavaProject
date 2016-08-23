import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��2��25�� ����9:21:20 
 * ��˵�� 
 * ����֪�����У��ǵ���ϵĺ͵���target,�������ظ�ʹ��
 */
public class CombinationSumII_leetCode_40 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	    List<List<Integer>>ret = new ArrayList<>();
	    List<Integer> temp = new ArrayList<>();
	    //�߽������ж�
	    if(candidates == null || candidates.length == 0)
	        return ret;
	    //������Ȼ�����õݹ��㷨
	    Arrays.sort(candidates);//������
	    findSum2(candidates,target,temp,ret,0,0);//�ݹ�ĳ�ʼֵ ��sum = 0,start_index = 0;
	   
	    
	    //ȥ���ظ��ģ�������HashSetɸѡһ�Σ�Ȼ���ڼ��뵽������С�
	    HashSet<List<Integer>> set = new HashSet<List<Integer>>(ret);
	    //remove duplicate lists
	    ret.clear();
	    ret.addAll(set);
	    
	    return ret;
		 
    }
	public void findSum2(int []candidates,int target,List<Integer>temp,List<List<Integer>>ret,int sum, int start){
		if(sum == target){//���ж��Ƿ��Ѿ�����������������������ˣ��ͼ���������
			ret.add(new ArrayList<>(temp));
			return;
		}else if (sum>target){
			return;			
		}else {//������Ǳ�targetС�������������̽����ʱ��start ֵ����һ�εݹ鴫�����ĺ�һ��Ԫ�ء�
			for(int i = start; i<candidates.length;i++){//�ӵ�ǰֵ��ʼѰ�ң���������Һܶಽ
				temp.add(candidates[i]);//�����������ȥ��̽��
				findSum2(candidates,target,temp,ret,sum+candidates[i],i+1);//�����ǰ�����㣬��������һ��
				temp.remove(temp.size()-1);//����Ҫ��һ����������һ���ʱ����Ҫ�޳���ǰ�ڵ�
			}
		}
		
	}
	
	
	public static void main(String[] args) {

	}

}
