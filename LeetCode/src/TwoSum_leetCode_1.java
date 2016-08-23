/**
 * FileName:     TwoSum.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年10月12日 下午4:07:25
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年10月12日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年10月12日 下午4:07:25 
 * 类说明 
 */
/**
 * @ClassName:     TwoSum
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年10月12日 下午4:07:25
 *
 */

public class TwoSum_leetCode_1 {	
	
	/**
	 * @param:
	 * @return: int []
	 * @Description: 数组实现思想简单,两次for循环
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
 * @Description: TODO(这里用一句话描述这个方法的作用)
 * @param: @param args   
 * @return: void   
 * @throws
 */
	public static void main(String[] args) {
		int [] test_num = {1,2,3};
		int [] result = null;
		TwoSum_leetCode_1 ts = new TwoSum_leetCode_1();
		result = ts.twoSum(test_num,3);
		
		
		
		System.out.println("结果是："+result[0]+result[1]);


	}

	
}
