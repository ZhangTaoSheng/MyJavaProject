/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年12月29日 下午9:40:39 
 * 类说明 
 */
public class MaxArea_leetCode_11 {
	public int maxArea(int[] height) {//
		int [] result = new int [height.length];
		//		int windowLength = height.length;//用窗的概念来理解这个问题
		int maxAre = 0;
		for(int i =height.length-1;i>0;i--){//从窗长最长开始，逐步缩短窗长，就可以得到最大面积了
			int [] win = new int [height.length-i] ;
			int max = 0;
			for(int j = 0; j<height.length-i;j++){//窗的起点位置,最大移动到当前窗能够接受的位置
				win[j] = (height[j]+height[j+i])*i/2;//梯形面积，（上底+下底）*高/2				
				if(max<win[j])max = win[j];
			}
			result[height.length-i-1] = max;
			if(result[height.length-i-1]>maxAre)maxAre = result[height.length-i-1];
		}
		return maxAre ;

	}
	
	public int maxArea_recur(int[] height) {
		int capability = 0;
		int  left = 0;
		int right = height.length - 1;

		while (left < right)
		{
			int water = Math.min(height[left], height[right]) * (right - left);//以短板为主

			if (water > capability) capability = water;//取容量大的作为比较

			if (height[left] < height[right])//每次将短板淘汰，朝着可能出现更大容积的隔板出前进。
			{
				++left;
			}
			else
			{
				--right;
			}
		}

		return capability;
	}



	public static void main(String args[]){
		MaxArea_leetCode_11 ma = new MaxArea_leetCode_11();
		int [] height = {1,1,1,1,1,5};
		int result = ma.maxArea(height);
		System.out.println("结果是："+result);

	}

}
