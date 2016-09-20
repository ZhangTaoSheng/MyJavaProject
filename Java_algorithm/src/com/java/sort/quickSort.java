package com.java.sort;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��4�� ����9:10:48 
 * ѡ��һ����׼Ԫ��,ͨ��ѡ���һ��Ԫ�ػ������һ��Ԫ��,ͨ��һ��ɨ�裬���������зֳ�������,һ���ֱȻ�׼Ԫ��С
 * һ���ִ��ڵ��ڻ�׼Ԫ��,��ʱ��׼Ԫ�������ź�������ȷλ��,Ȼ������ͬ���ķ����ݹ�����򻮷ֵ������֡�
 * ���������ƽ��ʱ�临�Ӷ�ΪO(nlogn)��������ʯO(n^2)
 *����n�ϴ�ʱʹ�ÿ��űȽϺã������л�������ʱ�ÿ��ŷ������á�
 * 
 */
public class quickSort {
	public static void main(String[] args) {
        int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8,3,324,34,32,34,3243,324,32423,1,6,7,56,85,432,45,736};
        System.out.println("����֮ǰ��");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //��������

        System.out.println();
        System.out.println("����֮��");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private static void quick(int[] a) {
        if(a.length>0){
            quickSort(a,0,a.length-1);
        }
    }

    private static void quickSort(int[] a, int low, int high) {
        if(low<high){ //�����������жϵݹ���޷��˳����¶�ջ����쳣
            int middle = getMiddle(a,low,high);
            quickSort(a, 0, middle-1);
            quickSort(a, middle+1, high);
        }
    }

    private static int getMiddle(int[] a, int low, int high) {
        int temp = a[low];//��׼Ԫ��
        while(low<high){
            //�ҵ��Ȼ�׼Ԫ��С��Ԫ��λ��
            while(low<high && a[high]>=temp){//����࿪ʼ��������������������Ȼ�׼ֵС��Ԫ�أ�������ѭ������ʱ����Ԫ�ط��ڻ�׼ֵ��λ���ϣ�ԭʼλ��������
            								//��׼ֵ�ĳ��У��ȴ�����
                high--;
            }
            a[low] = a[high]; 
            while(low<high && a[low]<=temp){//���Ҳ࿪ʼ��������������������Ȼ�׼ֵ���Ԫ�أ�������ѭ������ʱ����Ԫ�ط����ϸ���������������λ��
                low++;
            }
            a[high] = a[low];
        }
        a[low]=  temp;//��󽫣���׼ֵ����������λ���ϡ�
        return low;
    }

}
