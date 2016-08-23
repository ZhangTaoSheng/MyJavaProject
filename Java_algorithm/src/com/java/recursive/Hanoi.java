/**
 * FileName:     Hanoi.java
 * @Description: TODO(ѡ������)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��6��15�� ����10:40:54
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��6��15��       zts         1.0             1.0
 * 
 */
 
package com.java.recursive;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��6��15�� ����10:40:54 
 * ��˵�� 
 */
/**
 * @ClassName:     Hanoi
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��6��15�� ����10:40:54
 *
 */

import java.util.Scanner;

public class Hanoi {
	
	public static void main (String args[]){
		int n ;
		String beginNeedle = "A",middleNeedle = "B",endNeedle = "C";
		System.out.println("please input the Num of disks :" );
		Scanner keyIn = new Scanner(System.in);
		n = keyIn.nextInt();
		System.out.println("The input the disks :" +n);
		hanoi(n,beginNeedle ,endNeedle ,middleNeedle);
	
		
	}
	
	
	public static void hanoi(int n , String initNeedle, String endNeedle,String tempNeedle){
		if(n == 1 ){
			System.out.println(" ��һ��  move  "+ initNeedle + "  to  " +endNeedle);
			
		}
		else{
			hanoi(n-1,initNeedle,tempNeedle,endNeedle);
			System.out.println("�ٴ��ƶ�   move  "+initNeedle+"  to  "+endNeedle);
			hanoi(n-1,tempNeedle,endNeedle,initNeedle);
		}
	}

}
