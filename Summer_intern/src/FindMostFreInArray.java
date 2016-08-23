import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月6日 下午6:51:40 
 * 类说明 ：找到一个数组中，重复次数最多的元素。利用HashMap
 */
public class FindMostFreInArray {
	public Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	
	public int find(int [] arr){
		if(arr.length ==0)return -1;
		
		int ret =0;
		for(int i =0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1 );//HashMap中一个键只能映射一个值，当有重复键时，会覆盖前一次的映射值。
			}
			else {
				map.put(arr[i],1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		int mostF= Integer.MIN_VALUE;
		int mostKey = Integer.MAX_VALUE;
		while(it.hasNext()){
			Map.Entry<Integer,Integer> entry =(Map.Entry)it.next();//利用Key的HashCode()生成一个hash值，
			//如果不存在HashMap中，就直接<key，value>插入到HashMap中,如果存在，则遍历所有有着相同hash值的key,依次调用equal(),如果返回true，
			//则使用新的value值覆盖原有的值，否则，存入进HashMap.
			//记住:1.不同的key值可能有相同的hashCode，也就是说<key,value>可以在同一个Entry中出现.
			//    2.有多少个不同的hashCode,就会有多少个Entry
			//    3.一个key,只能唯一的映射一个value
			//    4.HashMap允许出现空键值对，但是最多只能出现一条记录
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
