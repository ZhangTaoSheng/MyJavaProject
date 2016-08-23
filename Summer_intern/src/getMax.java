/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月8日 下午3:22:56 
 * 类说明 
 * 求出一个数组的最大数对之差
 */
public class getMax {
	public static int getmax_serach(int []a){
		int ret = 0;
		if(a==null){
			return Integer.MIN_VALUE;
		}
		int len = a.length;
		if(len<=1)return Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i =0;i<len;i++){
			for(int j =i+1;j<len;j++){
				if(a[i]-a[j]>max){
					max = a[i]-a[j];
				}
			}
		}
		ret =max;
		return ret;
	}
	
	/*public  int getmax_bin(int []a){
		if(a == null)return Integer.MIN_VALUE;
	//	int ret = binsearch(a,0,a.length-1);
	//	return ret;
		
	}*/
	/*public int binsearch(int[]a,int left,int right){
		
	}*/
	
	public static void main(String []args){
		int a [] = {1,23,45,65,78,96};
		System.out.println(getMax.getmax_serach(a));
	}
	

}
