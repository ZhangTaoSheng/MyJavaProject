/**
 * FileName:     ReverseInteger.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��12��28�� ����10:33:55
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��12��28��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��12��28�� ����10:33:55 
 * ��˵�� 
 */
/**
 * @ClassName:     ReverseInteger
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��12��28�� ����10:33:55
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
			while(p_num != 0){ //������Ǽ�λ��
				p_num = p_num/10;
				num++;
			}
			result  = new double[num];
			for (int i= 0 ;i<num ;i++){
				result[num-i-1] = ((x/(int)Math.pow(10, i))%10);//ȡ��ÿλ��������
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
		System.out.println("����ǣ�"+result);
	}
}
