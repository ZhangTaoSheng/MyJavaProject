import java.awt.List;
import java.util.ArrayList;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��24�� ����9:40:03 
 * ��˵�� 
 */
public class CountingBits_leetCode_338 {
	public int[] countBits(int num){
		int []ret = new int[num+1];
		while(num>=0){
			int tmp = num;
			int count=0;
			while(tmp>0){
				tmp = tmp&(tmp-1);
				count++;
			}
			ret[num] = count;
			num--;
		}
		return ret;
		
	}
	public static void main(String args[]){
		CountingBits_leetCode_338 ls = new CountingBits_leetCode_338();
		int num = 5;
		int []ret =ls.countBits(num);
		for(int i =0;i<ret.length;i++){
			System.out.println(""+ret[i]);
		}
	}

}
