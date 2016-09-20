package com.java.sort;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月4日 下午9:10:48 
 * 选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小
 * 一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 * 快速排序的平均时间复杂度为O(nlogn)，最坏情况下石O(n^2)
 *　当n较大时使用快排比较好，当序列基本有序时用快排反而不好。
 * 
 */
public class quickSort {
	public static void main(String[] args) {
        int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8,3,324,34,32,34,3243,324,32423,1,6,7,56,85,432,45,736};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //快速排序

        System.out.println();
        System.out.println("排序之后：");
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
        if(low<high){ //如果不加这个判断递归会无法退出导致堆栈溢出异常
            int middle = getMiddle(a,low,high);
            quickSort(a, 0, middle-1);
            quickSort(a, middle+1, high);
        }
    }

    private static int getMiddle(int[] a, int low, int high) {
        int temp = a[low];//基准元素
        while(low<high){
            //找到比基准元素小的元素位置
            while(low<high && a[high]>=temp){//从左侧开始往右搜索，如果搜索到比基准值小的元素，则跳出循环，此时将该元素放在基准值的位置上，原始位置留出。
            								//基准值的出列，等待放置
                high--;
            }
            a[low] = a[high]; 
            while(low<high && a[low]<=temp){//从右侧开始往左搜索，如果搜索到比基准值大的元素，则跳出循环，此时将该元素放在上个搜索过程留出的位置
                low++;
            }
            a[high] = a[low];
        }
        a[low]=  temp;//最后将，基准值放在相遇的位置上。
        return low;
    }

}
