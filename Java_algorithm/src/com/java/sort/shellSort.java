package com.java.sort;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��5�� ����1:18:18 
 * ��˵��  ϣ������
 * 1��ѡ�񲽳��������ݼ������һ��������Ϊ1
 * 2���������ĸ���k, �Դ������н���k������
 * 3��ÿ������ʱ�����ò�������
 */
public class shellSort {

	public void shell(int [] a ){
		int d = a.length;
		while(true){
			d = d / 2; //��������
			for(int x=0;x<d;x++){//��ǰ�����ĵ�x�����н��в�������
				for(int i=x+d;i<a.length;i=i+d){
					int temp = a[i];
					int j;
					for(j=i-d;j>=0&&a[j]>temp;j=j-d){
							a[j+d] = a[j];		
					}
					a[j+d] = temp;//���������ǲ��ڵ�ǰ�ҵ���ֵ�ĺ���һ��
				}
			}
			if(d == 1){
				break;
			}
		}

	}


	public static void main (String [] args){
		shellSort ss = new shellSort ();
		int [] a = {2,3,53,543,22,1,44,6};
		ss.shell(a);
		for (int i = 0; i < a.length; i++) {  
			System.out.print(a[i] + "\t");  
		}  
	}
}
