/**
 * FileName:     TwoSum.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��10��12�� ����4:07:25
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��10��12��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��10��12�� ����4:07:25 
 * ��˵�� 
 */
/**
 * @ClassName:     TwoSum
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��10��12�� ����4:07:25
 *
 */

public class TwoSum_leetCode_1 {	
	
	/**
	 * @param:
	 * @return: int []
	 * @Description: ����ʵ��˼���,����forѭ��
	 */
public int [] twoSum(int[]nums , int target){
	int [] result  = new int[2];
	int index_1,index_2;
	int temp1,temp2;
	int length = nums.length ;
	for(int i =0;i<length;i++){
		for(int j=i+1;j<length;j++){
			if (nums[i]+nums[j] == target){
				index_1 = i;
				index_2 = j;
				result[0]=index_1;
				result[1]=index_2;
			}
		}
	}
	
	
	return result;
}
/**
 * @Title: main
 * @Description: TODO(������һ�仰�����������������)
 * @param: @param args   
 * @return: void   
 * @throws
 */
	public static void main(String[] args) {
		int [] test_num = {1,2,3};
		int [] result = null;
		TwoSum_leetCode_1 ts = new TwoSum_leetCode_1();
		result = ts.twoSum(test_num,3);
		
		
		
		System.out.println("����ǣ�"+result[0]+result[1]);


	}

	
}
