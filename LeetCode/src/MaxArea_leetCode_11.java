/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��12��29�� ����9:40:39 
 * ��˵�� 
 */
public class MaxArea_leetCode_11 {
	public int maxArea(int[] height) {//
		int [] result = new int [height.length];
		//		int windowLength = height.length;//�ô��ĸ���������������
		int maxAre = 0;
		for(int i =height.length-1;i>0;i--){//�Ӵ������ʼ�������̴������Ϳ��Եõ���������
			int [] win = new int [height.length-i] ;
			int max = 0;
			for(int j = 0; j<height.length-i;j++){//�������λ��,����ƶ�����ǰ���ܹ����ܵ�λ��
				win[j] = (height[j]+height[j+i])*i/2;//������������ϵ�+�µף�*��/2				
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
			int water = Math.min(height[left], height[right]) * (right - left);//�Զ̰�Ϊ��

			if (water > capability) capability = water;//ȡ���������Ϊ�Ƚ�

			if (height[left] < height[right])//ÿ�ν��̰���̭�����ſ��ܳ��ָ����ݻ��ĸ����ǰ����
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
		System.out.println("����ǣ�"+result);

	}

}
