import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��6�� ����6:51:40 
 * ��˵�� ���ҵ�һ�������У��ظ���������Ԫ�ء�����HashMap
 */
public class FindMostFreInArray {
	public Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	
	public int find(int [] arr){
		if(arr.length ==0)return -1;
		
		int ret =0;
		for(int i =0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1 );//HashMap��һ����ֻ��ӳ��һ��ֵ�������ظ���ʱ���Ḳ��ǰһ�ε�ӳ��ֵ��
			}
			else {
				map.put(arr[i],1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		int mostF= Integer.MIN_VALUE;
		int mostKey = Integer.MAX_VALUE;
		while(it.hasNext()){
			Map.Entry<Integer,Integer> entry =(Map.Entry)it.next();//����Key��HashCode()����һ��hashֵ��
			//���������HashMap�У���ֱ��<key��value>���뵽HashMap��,������ڣ����������������ͬhashֵ��key,���ε���equal(),�������true��
			//��ʹ���µ�valueֵ����ԭ�е�ֵ�����򣬴����HashMap.
			//��ס:1.��ͬ��keyֵ��������ͬ��hashCode��Ҳ����˵<key,value>������ͬһ��Entry�г���.
			//    2.�ж��ٸ���ͬ��hashCode,�ͻ��ж��ٸ�Entry
			//    3.һ��key,ֻ��Ψһ��ӳ��һ��value
			//    4.HashMap������ֿռ�ֵ�ԣ��������ֻ�ܳ���һ����¼
			int key = entry.getKey();
			int value = entry.getValue();
			if(value>mostF){
				mostF = value;
				ret = value;
				
			}
		}
		return ret;
	}
}
