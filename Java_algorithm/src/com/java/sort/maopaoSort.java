package com.java.sort;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��4�� ����9:09:09 
 * ��˵�� 
 */
public class maopaoSort {
	public void mergeSort_descend(int[] a){
	//ð������
	for (int i = 0; i < a.length; i++) {//һ�������Ƚ�
		for(int j = 0; j<a.length-i-1; j++){
			//����-i��Ҫ��ÿ����һ�ζ�������i�������������ȥ�ˣ�û�б�Ҫ���滻��
			if(a[j]>a[j+1]){//ÿ�αȽ����ڵ���������
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
			
		}
		for (int s = 0; s < a.length; s++) {
			System.out.print(a[s]+" ");
		}
		System.out.println('\n'+"�� "+(i+1)+" ������");
	}
	System.out.println();
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
		}
	}
	public void mergeSort_raise(int[] a){
		//ð������
		for (int i = 0; i < a.length; i++) {//һ�������Ƚ�
			for(int j = a.length-1; j>i; --j){
				//ÿһ�ΰ���С����������ǰ��
				if(a[j]<a[j-1]){//ÿ�αȽ����ڵ���������
					int temp = a[j];

					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			for (int s = 0; s < a.length; s++) {
				System.out.print(a[s]+" ");
			}
			System.out.println('\n'+"�� "+(i+1)+" ������");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			}
		}
public static void main(String[] args) {
	int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
	System.out.println("����֮ǰ��");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println(""+'\n');
	maopaoSort ms = new maopaoSort();
	//ms.mergeSort_descend(a);
	ms.mergeSort_raise(a);
	
	}
}