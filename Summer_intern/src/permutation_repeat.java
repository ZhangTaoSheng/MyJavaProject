/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��18�� ����8:15:06 
 * ��˵�� 
 * ���nΪ���������������õݹ�ʵ�֡�
 */
public class permutation_repeat {
	public void permutation(int n){ 
		if (n == 0)return ;
		int [] numbers = new int[n];
		for(int j = 0; j<n;j++){
			numbers[j] = 0;
		}
		
		for(int i = 0 ;i<10 ;i++){
				numbers[0] = i;
				dfs(numbers,n,0);//��λ��0-9�����У������λ�������õݹ���ʵ��
		}
	}
	public void dfs(int [] numbers ,int length,int index){//index�ǵ�ǰ�ڼ�λ
		if(index == length-1){//ֱ�����е���nλ�����ݹ�
			for(int i = 0 ;i<length;i++){
				System.out.print(numbers[i]);
			}
			System.out.println();
			return;
		}
		for(int j = 0; j<10;j++){			
			numbers[index+1] = j;//ÿһλ����10����ϣ�
			dfs(numbers, length,index+1);//length�������ǵݹ����������������ǰ������н����󣬽�����һλ������
		}
	}
	
	public static void main(String args[]){
		permutation_repeat ls = new permutation_repeat();
		ls.permutation(3);
	}
	
}
