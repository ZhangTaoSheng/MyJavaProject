import java.util.ArrayList;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��3�� ����9:38:32 
 * ��˵�� 
 * ��ӡ1��2��3��4��5��������Էֽ�����¼���������
 * ��ӡ1�� ��ӡ��2��3��4��5����ȫ����
 * ��ӡ2�� ��ӡ��1��3��4��5����ȫ����
 * ��ӡ3�� ��ӡ ��1��2��4��5����ȫ����
 * ��ӡ4�� ��ӡ ��1��2��3��5����ȫ����
 * ��ӡ5�� ��ӡ ��1��2��3��4����ȫ����
 * ÿ��������Ŀ��Լ����ֽ���ȥ
 * 
 */
public class Permutations_leetCode_46 {
	/**
	 * 
	 * @Title: dfs
	 * @Description: TODO(������һ�仰�����������������)
	 * @param: @param i ��ʾ��ǰѡ��ڼ���Ԫ����Ϊ������Ԫ��
	 * @param: @param num
	 * @param: @param result   
	 * @return: void   
	 * @throws
	 */
	void dfs(int i, int[] num,ArrayList<ArrayList<Integer>> result) {  
        if(i==num.length) {  //�ݹ������������������Ҫ������ʱ��˵�����Դ�ӡ��
        	 ArrayList<Integer> temp =new ArrayList<Integer>();
            for(int j=0;j<num.length;j++) {            	 
            	 temp.add(num[j]);
            	 System.out.print(num[j]+" ");
            }        
            System.out.println();
            result.add(temp);  
            return;  
        }  
        for(int j=i;j<num.length;j++) {  
            int tmp = num[i];  //ÿ�����һ��Ԫ�ؽ��н�����
            num[i]  = num[j];  
            num[j]  = tmp; 
            							//�ݹ鲻Ҫһ�������룬ֻ��Ҫ�������������������ҵ��ݹ�ĳ���    
            dfs(i+1,num,result);  		//������������д��,��� ����������������������ʱ�򣬳�ջ��
            
            tmp = num[i];  
            num[i]  = num[j];  			//��i������������󣬻���Ҫ swap(a[1],a[i])�����������ٽ����һ�������⣬��Ȼ������Ĵ�������ˡ�
            num[j]  = tmp;  
            
        }  
    }  
      
    public ArrayList<ArrayList<Integer>> permute(int[] num) {  
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();  
          
        if(num==null||num.length==0) {  
            ArrayList<Integer> tmp = new ArrayList<Integer>();  
            result.add(tmp);  
            return result;  
        }  
        dfs(0,num,result);  
        return result;  
    }  
    
    public static void main(String []args){
    	Permutations_leetCode_46 ls = new Permutations_leetCode_46();
    	int [] num = {1,2,3,4};
    	ls.permute(num);
    }
}  

