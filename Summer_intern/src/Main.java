
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;
public class Main{
	public static int binSearch(int arr[],int first ,int last , int target){
		int mid =0 ;
		int midValue =0;
		while(first<last){//二分查找的终止条件是，当first >= last 的时候,说明已经搜索完毕了。
			mid = (first+last)/2;
			midValue = arr[mid];
			if(midValue==target) return mid;
			else if(midValue>target){
				last = mid;
			}
			else
				first = mid +1;
		}
		return -1-(mid);
	}
	
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int target = s.nextInt();
    int nums = s.nextInt();
    int[] array_input = new int[nums];
    for(int i =0; i<nums;i++)
    {
    	array_input[i] = s.nextInt();
    }
    Main m = new Main();
   int ret =  binSearch(array_input,0,array_input.length-1,target);
   System.out.println(ret);
      
}


}
