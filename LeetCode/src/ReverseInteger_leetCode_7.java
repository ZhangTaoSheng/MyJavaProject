/**
 * FileName:     ReverseInteger.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年12月28日 上午10:33:55
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年12月28日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年12月28日 上午10:33:55 
 * 类说明 
 */
/**
 * @ClassName:     ReverseInteger
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年12月28日 上午10:33:55
 *
 */
//import java.math.*;
//import java.util.*;
import java.math.*;
public class ReverseInteger_leetCode_7 {
	 public int reverse(int x) {
	    
			double result_int = 0;
			int num = 0;
			int p_num =x;
			double [] result ;
			while(p_num != 0){ //计算出是几位数
				p_num = p_num/10;
				num++;
			}
			result  = new double[num];
			for (int i= 0 ;i<num ;i++){
				result[num-i-1] = ((x/(int)Math.pow(10, i))%10);//取出每位数，倒置
				result_int = result_int+result[num-i-1]*Math.pow(10, num-i-1);
				if(result_int>Integer.MAX_VALUE||result_int<Integer.MIN_VALUE){
				    return 0;				 
				}
			}
			
			return (int)result_int ;
	    }
	public static void main(String args[]){
		int a = -2147483648;
		ReverseInteger_leetCode_7 test = new ReverseInteger_leetCode_7();
		int result =test.reverse(a);
		System.out.println("结果是："+result);
	}
}
