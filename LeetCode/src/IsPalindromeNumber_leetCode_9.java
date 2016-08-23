/**
 * FileName:     IsPalindromeNumber.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��12��28�� ����3:23:35
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��12��28��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��12��28�� ����3:23:35 
 * ��˵�� 
 */
/**
 * @ClassName:     IsPalindromeNumber
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��12��28�� ����3:23:35
 *
 */

public class IsPalindromeNumber_leetCode_9 {
	public boolean isPalindrome(int x) {
		if(x<0)return false;
		int num = 0;
		int count = 0;
		int p = x;
		while(p!= 0)
		{
			p =p/10;
			num++;			 
		}
		for (int i = 0 ;i<num;i++){
			int temp1 = (int)(x/Math.pow(10, i))%10;
			int temp2 = (int)(x/Math.pow(10, num-i-1))%10;
			if(temp1!=temp2)return false;
			count++;
		}
		if(count == num)		 
			return true;	
		else 
			return false;
	}
	public static void main(String []args){
		int a  = 123321;
		IsPalindromeNumber_leetCode_9 IN = new IsPalindromeNumber_leetCode_9();
		boolean result = IN.isPalindrome(a);
		System.out.println("����ǣ�"+result);
	}
}
