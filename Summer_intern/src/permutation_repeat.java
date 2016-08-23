/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月18日 下午8:15:06 
 * 类说明 
 * 输出n为数的所有整数，用递归实现。
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
				dfs(numbers,n,0);//个位是0-9的排列，其余的位数，利用递归来实现
		}
	}
	public void dfs(int [] numbers ,int length,int index){//index是当前第几位
		if(index == length-1){//直到排列到第n位结束递归
			for(int i = 0 ;i<length;i++){
				System.out.print(numbers[i]);
			}
			System.out.println();
			return;
		}
		for(int j = 0; j<10;j++){			
			numbers[index+1] = j;//每一位都有10中组合，
			dfs(numbers, length,index+1);//length传进来是递归出口所需条件，当前组合排列结束后，进行下一位的排列
		}
	}
	
	public static void main(String args[]){
		permutation_repeat ls = new permutation_repeat();
		ls.permutation(3);
	}
	
}
