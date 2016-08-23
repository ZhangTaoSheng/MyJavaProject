/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��6�� ����8:54:55 
 * ��˵�� 
 */
public class GetKMin {
	public int ret=Integer.MIN_VALUE;
	public int getKmin(int []a,int k){
		if(a.length == 0)return Integer.MIN_VALUE;
		if(k>a.length)return Integer.MIN_VALUE;
		quickSort(a,0,a.length-1,k);
		return ret;
	}
	public void quickSort(int a[],int start,int end,int target){
		if(start<end){
			int Mid = getMid(a,start,end);//���Ż�ȡ��ǰֵ�����������е�λ��
			System.out.println("��ǰ��ţ�"+(Mid+1));
			print(a);
			if(Mid+1<target){
				quickSort( a,Mid,end,target-Mid);
			}else if(Mid+1>target){
				quickSort(a,start,Mid,target); 
			}else{
				ret = a[Mid];
			}
			
		}		
	}
	public int getMid(int a[],int left,int right){
		int temp = a[left];
		while(left<right){
			while(left<right&&temp<=a[right]){//ǧ�������˵���
				right--;				
			}
			a[left] = a[right];//��Ŀ��ֵС�ģ������ϴ���ָ��ָ���λ��
			while(left<right&&temp>=a[left]){
				left++;
			}
			a[right] = a[left];//��Ŀ��ֵ��ģ������ϴ���ָ��ָ���λ��
		}
		a[left] = temp;//���Ŀ��ֵ���ں��ʵ�λ��
		return left;
	}
	
	public void print(int []a ){
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String []args){
		GetKMin gk = new GetKMin();
		int[] nums = {5,2,3,6,4,7,9};
		System.out.println("����ǣ�"+gk.getKmin(nums, 5));
		
	}
}
